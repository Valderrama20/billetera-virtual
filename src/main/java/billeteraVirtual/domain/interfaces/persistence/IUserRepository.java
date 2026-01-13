package billeteraVirtual.domain.interfaces.persistence;

import billeteraVirtual.domain.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface IUserRepository {
    Optional<User> getById(UUID id);

    User save(User user);

    Optional<User> update(User user);

    Boolean delete(UUID id);
}
