package billeteraVirtual.application.ports.input;

import billeteraVirtual.domain.model.User;

public interface CreateUserUseCase {
    User execute(User user);
}
