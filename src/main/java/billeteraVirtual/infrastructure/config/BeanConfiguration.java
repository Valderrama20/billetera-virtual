package billeteraVirtual.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import billeteraVirtual.domain.interfaces.persistence.IUserRepository;
import billeteraVirtual.infrastructure.persistence.mem.InMemoryUserRepository;
import billeteraVirtual.domain.interfaces.usecases.user.ICreateUserUseCase;
import billeteraVirtual.domain.interfaces.usecases.user.IGetUserByIdUseCase;
import billeteraVirtual.domain.interfaces.usecases.user.IUpdateUserUseCase;
import billeteraVirtual.domain.interfaces.usecases.user.IDeleteUserUseCase;
import billeteraVirtual.application.usecases.user.CreateUserUseCase;
import billeteraVirtual.application.usecases.user.GetUserByIdUseCase;
import billeteraVirtual.application.usecases.user.UpdateUserUseCase;
import billeteraVirtual.application.usecases.user.DeleteUserUseCase;

@Configuration
public class BeanConfiguration {

    @Bean
    public IUserRepository userRepository() {
        return new InMemoryUserRepository();
    }

    @Bean
    public ICreateUserUseCase createUserUseCase(IUserRepository userRepository) {
        return new CreateUserUseCase(userRepository);
    }

    @Bean
    public IGetUserByIdUseCase getUserByIdUseCase(IUserRepository userRepository) {
        return new GetUserByIdUseCase(userRepository);
    }

    @Bean
    public IUpdateUserUseCase updateUserUseCase(IUserRepository userRepository) {
        return new UpdateUserUseCase(userRepository);
    }

    @Bean
    public IDeleteUserUseCase deleteUserUseCase(IUserRepository userRepository) {
        return new DeleteUserUseCase(userRepository);
    }
}
