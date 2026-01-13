package billeteraVirtual.application.usecases.user;

import billeteraVirtual.domain.interfaces.usecases.user.ICreateUserUseCase;
import billeteraVirtual.domain.entities.User;
import billeteraVirtual.domain.interfaces.persistence.IUserRepository;

public class CreateUserUseCase implements ICreateUserUseCase {
    private final IUserRepository userRepository;

    public CreateUserUseCase(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User execute(User user) {
        return userRepository.save(user);
    }
}
