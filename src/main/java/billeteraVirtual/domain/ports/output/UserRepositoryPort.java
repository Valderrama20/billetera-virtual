package billeteraVirtual.domain.ports.output;

import billeteraVirtual.domain.model.User;

public interface UserRepositoryPort {
    User save(User user);
}
