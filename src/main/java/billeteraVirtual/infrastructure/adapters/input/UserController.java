package billeteraVirtual.infrastructure.adapters.input;
import billeteraVirtual.application.ports.input.CreateUserUseCase;
import billeteraVirtual.domain.model.User;
import billeteraVirtual.infrastructure.adapters.input.dto.CreateUserRequest;
import billeteraVirtual.infrastructure.adapters.input.dto.CreateUserResponse;
import billeteraVirtual.infrastructure.adapters.input.mapper.CreateUserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final CreateUserMapper createUserMapper;

    public UserController(CreateUserUseCase createUserUseCase, CreateUserMapper createUserMapper) {
        this.createUserUseCase = createUserUseCase;
        this.createUserMapper = createUserMapper;
    }

    @PostMapping
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest request) {

        // 1. Transformamos la entrada
        User userToCreate = createUserMapper.toDomain(request);

        // 2. Ejecutamos lógica de negocio
        User createdUser = createUserUseCase.execute(userToCreate);

        // 3. Transformamos la salida para el cliente
        CreateUserResponse response = createUserMapper.toResponse(createdUser);

        // respondemos al usuario
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
