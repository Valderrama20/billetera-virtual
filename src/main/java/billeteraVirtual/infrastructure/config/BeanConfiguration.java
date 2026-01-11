package billeteraVirtual.infrastructure.config;

import billeteraVirtual.application.services.UserServiceImpl;
import billeteraVirtual.infrastructure.adapters.output.UserListRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public UserServiceImpl createUserService(){
        return new UserServiceImpl(new UserListRepositoryAdapter());
    }
}
