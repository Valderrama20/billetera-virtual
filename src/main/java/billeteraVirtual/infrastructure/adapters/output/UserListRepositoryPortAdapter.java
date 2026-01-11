package billeteraVirtual.infrastructure.adapters.output;

import billeteraVirtual.domain.model.User;
import billeteraVirtual.domain.ports.output.UserRepositoryPort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserListRepositoryPortAdapter implements UserRepositoryPort {
    private final List<User> users;

    public UserListRepositoryPortAdapter() {
        this.users = new ArrayList<User>();
    }

    @Override
    public Optional<User> getById(UUID id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }

        return Optional.empty();
    }


    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

    @Override
    public Optional<User> update(User user) {
        return this.getById(user.getId())
                .map(existing -> {
                    if (user.getFirstName() != null) {
                        existing.setFirstName(user.getFirstName());
                    }
                    if (user.getLastName() != null) {
                        existing.setLastName(user.getLastName());
                    }
                    return existing;
                });


    }

    @Override
    public Boolean delete(UUID id) {
        return this.getById(id).map(user -> {
            users.remove(user);
            return true;
        }).orElse(false);
    }
}
