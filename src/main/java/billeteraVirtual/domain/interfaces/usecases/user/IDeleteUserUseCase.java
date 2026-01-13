package billeteraVirtual.domain.interfaces.usecases.user;

import java.util.UUID;

public interface IDeleteUserUseCase {
    Boolean execute(UUID id);
}
