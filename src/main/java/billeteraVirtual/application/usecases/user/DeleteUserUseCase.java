package billeteraVirtual.application.usecases.user;

import billeteraVirtual.domain.interfaces.usecases.user.IDeleteUserUseCase;
import billeteraVirtual.domain.interfaces.persistence.IUserRepository;

import java.util.UUID;

public class DeleteUserUseCase implements IDeleteUserUseCase {
    private final IUserRepository userRepository;

    public DeleteUserUseCase(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Boolean execute(UUID id) {
        return userRepository.delete(id);
    }
}
