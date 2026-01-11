package billeteraVirtual.infrastructure.adapters.input;
import billeteraVirtual.domain.ports.input.IUserService;
import billeteraVirtual.domain.model.User;
import billeteraVirtual.infrastructure.adapters.input.dto.CreateUserRequest;
import billeteraVirtual.infrastructure.adapters.input.dto.CreateUserResponse;
import billeteraVirtual.infrastructure.adapters.input.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;
    private final UserMapper userMapper;

    public UserController(IUserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest request) {

        // 1. Transformamos la entrada
        User userToCreate = userMapper.toDomain(request);

        // 2. Ejecutamos lógica de negocio
        User createdUser = userService.createUser(userToCreate);

        // 3. Transformamos la salida para el cliente
        CreateUserResponse response = userMapper.toResponse(createdUser);

        // respondemos al usuario
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
