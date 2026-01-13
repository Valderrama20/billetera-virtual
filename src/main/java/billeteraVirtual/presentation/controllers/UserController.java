package billeteraVirtual.presentation.controllers;

import billeteraVirtual.domain.interfaces.usecases.user.ICreateUserUseCase;
import billeteraVirtual.domain.interfaces.usecases.user.IGetUserByIdUseCase;
import billeteraVirtual.domain.entities.User;
import billeteraVirtual.presentation.dto.CreateUserRequest;
import billeteraVirtual.presentation.dto.CreateUserResponse;
import billeteraVirtual.presentation.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    private final ICreateUserUseCase createUserUseCase;
    private final IGetUserByIdUseCase getUserByIdUseCase;
    private final UserMapper userMapper;

    public UserController(ICreateUserUseCase createUserUseCase, IGetUserByIdUseCase getUserByIdUseCase,
            UserMapper userMapper) {
        this.createUserUseCase = createUserUseCase;
        this.getUserByIdUseCase = getUserByIdUseCase;
        this.userMapper = userMapper;
    }

    // Aqui estoy retornando la entidad porque no quiero crear los dtos y mapper
    // pero esta practica esta mal ya que exponemos nuestro modelo de dominio
    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable UUID id) {
        return getUserByIdUseCase.execute(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest request) {

        // 1. Transformamos la entrada
        User userToCreate = userMapper.toDomain(request);

        // 2. Ejecutamos lógica de negocio
        User createdUser = createUserUseCase.execute(userToCreate);

        // 3. Transformamos la salida para el cliente
        CreateUserResponse response = userMapper.toResponse(createdUser);

        // respondemos al usuario
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
