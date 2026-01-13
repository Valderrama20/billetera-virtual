package billeteraVirtual.application.usecases.user;

import billeteraVirtual.domain.interfaces.usecases.user.IGetUserByIdUseCase;
import billeteraVirtual.domain.entities.User;
import billeteraVirtual.domain.interfaces.persistence.IUserRepository;

import java.util.Optional;
import java.util.UUID;

public class GetUserByIdUseCase implements IGetUserByIdUseCase {
    private final IUserRepository userRepository;

    public GetUserByIdUseCase(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> execute(UUID id) {
        return userRepository.getById(id);
    }
}
