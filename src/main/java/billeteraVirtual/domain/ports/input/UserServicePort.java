package billeteraVirtual.domain.ports.input;

import billeteraVirtual.domain.model.User;

public interface UserServicePort {
    User create(User user);
}
