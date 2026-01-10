package billeteraVirtual.infrastructure.adapters.input.mapper;

import billeteraVirtual.domain.model.User;
import billeteraVirtual.infrastructure.adapters.input.dto.CreateUserRequest;
import billeteraVirtual.infrastructure.adapters.input.dto.CreateUserResponse;
import org.springframework.stereotype.Component;

@Component
public class CreateUserMapper {

    public User toDomain(CreateUserRequest request) {
        return new User(
                request.firstName(),
                request.lastName(),
                request.email(),
                request.password()
        );
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
