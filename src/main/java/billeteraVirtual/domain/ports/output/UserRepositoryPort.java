package billeteraVirtual.domain.ports.output;

import billeteraVirtual.domain.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepositoryPort {
    Optional<User> getById(UUID id);

    User save(User user);

    Optional<User> update(User user);

    Boolean delete(UUID id);

}
