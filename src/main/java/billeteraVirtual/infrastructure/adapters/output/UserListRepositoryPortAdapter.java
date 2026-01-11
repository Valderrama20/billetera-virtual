package billeteraVirtual.infrastructure.adapters.output;

import billeteraVirtual.domain.model.User;
import billeteraVirtual.domain.ports.output.UserRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class UserListRepositoryPortAdapter implements UserRepositoryPort {
    private final List<User> users;

    public UserListRepositoryPortAdapter(){
        this.users = new ArrayList<User>();
    }

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

}
