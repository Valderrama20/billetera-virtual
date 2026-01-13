package billeteraVirtual.infrastructure.persistence.mem;

import billeteraVirtual.domain.entities.User;
import billeteraVirtual.domain.interfaces.persistence.IUserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class InMemoryUserRepository implements IUserRepository {
    private final List<User> users;

    public InMemoryUserRepository() {
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
