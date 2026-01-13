package billeteraVirtual.domain.interfaces.usecases.user;

import billeteraVirtual.domain.entities.User;
import java.util.Optional;

public interface IUpdateUserUseCase {
    Optional<User> execute(User user);
}
