package billeteraVirtual.domain.ports.output;

import billeteraVirtual.domain.model.User;

public interface IUserRepository {
    User save(User user);
}
