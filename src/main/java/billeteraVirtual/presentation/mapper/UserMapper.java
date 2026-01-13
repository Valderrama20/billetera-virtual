package billeteraVirtual.presentation.mapper;

import billeteraVirtual.domain.entities.User;
import billeteraVirtual.presentation.dto.CreateUserRequest;
import billeteraVirtual.presentation.dto.CreateUserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toDomain(CreateUserRequest request) {
        return new User(
                request.firstName(),
                request.lastName(),
                request.email(),
                request.password());
    }

    public CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getRole(),
                user.getUpdatedAt(),
                user.getUpdatedAt());
    }

}
