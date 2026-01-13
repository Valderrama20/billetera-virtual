package billeteraVirtual.domain.interfaces.usecases.user;

import billeteraVirtual.domain.entities.User;
import java.util.Optional;
import java.util.UUID;

public interface IGetUserByIdUseCase {
    Optional<User> execute(UUID id);
}
