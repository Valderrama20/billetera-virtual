package billeteraVirtual.application.services;

import billeteraVirtual.domain.model.User;
import billeteraVirtual.domain.ports.input.UserServicePort;
import billeteraVirtual.domain.ports.output.UserRepositoryPort;

public class UserService implements UserServicePort {

    public final UserRepositoryPort userRepository;

    public UserService(UserRepositoryPort userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return user;
    }
}
