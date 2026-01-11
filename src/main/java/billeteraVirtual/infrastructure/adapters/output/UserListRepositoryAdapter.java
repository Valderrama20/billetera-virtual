package billeteraVirtual.infrastructure.adapters.output;

import billeteraVirtual.domain.model.User;
import billeteraVirtual.domain.ports.output.IUserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserListRepositoryAdapter implements IUserRepository {
    private final List<User> users;

    public UserListRepositoryAdapter(){
        this.users = new ArrayList<User>();
    }

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

}
