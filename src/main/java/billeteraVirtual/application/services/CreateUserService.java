package billeteraVirtual.application.services;

import billeteraVirtual.application.ports.input.CreateUserUseCase;
import billeteraVirtual.domain.model.User;

public class CreateUserService implements CreateUserUseCase {

    @Override
    public User execute(User user){
        return user;
    }
}
