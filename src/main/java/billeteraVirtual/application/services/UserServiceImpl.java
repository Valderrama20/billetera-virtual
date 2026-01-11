package billeteraVirtual.application.services;

import billeteraVirtual.domain.model.User;
import billeteraVirtual.domain.ports.input.IUserService;
import billeteraVirtual.domain.ports.output.IUserRepository;

public class UserServiceImpl implements IUserService {

    public final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return user;
    }
}
