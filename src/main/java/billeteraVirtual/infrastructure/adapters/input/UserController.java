package billeteraVirtual.infrastructure.adapters.input;

import billeteraVirtual.domain.ports.input.UserServicePort;
import billeteraVirtual.domain.model.User;
import billeteraVirtual.infrastructure.adapters.input.dto.CreateUserRequest;
import billeteraVirtual.infrastructure.adapters.input.dto.CreateUserResponse;
import billeteraVirtual.infrastructure.adapters.input.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServicePort userService;
    private final UserMapper userMapper;

    public UserController(UserServicePort userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    // Aqui estoy retornando la entidad porque no quiero crear los dtos y mapper
    // pero esta practica esta mal ya que exponemos nuestro modelo de dominio
    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable UUID id) {
        return userService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest request) {

        // 1. Transformamos la entrada
        User userToCreate = userMapper.toDomain(request);

        // 2. Ejecutamos lógica de negocio
        User createdUser = userService.create(userToCreate);

        // 3. Transformamos la salida para el cliente
        CreateUserResponse response = userMapper.toResponse(createdUser);

        // respondemos al usuario
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
