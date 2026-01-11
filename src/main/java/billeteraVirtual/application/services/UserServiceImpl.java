package billeteraVirtual.application.services;

import billeteraVirtual.domain.model.User;
import billeteraVirtual.domain.ports.input.IUserService;

public class UserServiceImpl implements IUserService {

    @Override
    public User createUser(User user) {
        return user;
    }
}
