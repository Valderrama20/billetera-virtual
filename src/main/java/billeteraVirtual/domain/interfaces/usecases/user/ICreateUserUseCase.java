package billeteraVirtual.domain.interfaces.usecases.user;

import billeteraVirtual.domain.entities.User;

public interface ICreateUserUseCase {
    User execute(User user);
}
