package billeteraVirtual.application.services;

import billeteraVirtual.domain.model.User;
import billeteraVirtual.domain.ports.input.UserServicePort;
import billeteraVirtual.domain.ports.output.UserRepositoryPort;

import java.util.Optional;
import java.util.UUID;

public class UserService implements UserServicePort {

    public final UserRepositoryPort userRepository;

    public UserService(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getById(UUID id) {
        return userRepository.getById(id);
    }

    @Override
    public User create(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public Optional<User> update(User user) {
        return userRepository.update(user);
    }

    @Override
    public Boolean delete(UUID id) {
        return this.userRepository.delete(id);
    }
}
