package billeteraVirtual.domain.ports.input;

import billeteraVirtual.domain.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserServicePort {

    Optional<User> getById(UUID id);

    User create(User user);

    Optional<User> update(User user);

    Boolean delete(UUID id);

}
