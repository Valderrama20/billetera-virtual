package billeteraVirtual.domain.ports.input;

import billeteraVirtual.domain.model.User;

public interface IUserService {
    User createUser(User user);
}
