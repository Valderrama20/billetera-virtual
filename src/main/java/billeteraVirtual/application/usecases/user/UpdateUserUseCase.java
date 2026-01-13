package billeteraVirtual.application.usecases.user;

import billeteraVirtual.domain.interfaces.usecases.user.IUpdateUserUseCase;
import billeteraVirtual.domain.entities.User;
import billeteraVirtual.domain.interfaces.persistence.IUserRepository;

import java.util.Optional;

public class UpdateUserUseCase implements IUpdateUserUseCase {
    private final IUserRepository userRepository;

    public UpdateUserUseCase(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> execute(User user) {
        return userRepository.update(user);
    }
}
