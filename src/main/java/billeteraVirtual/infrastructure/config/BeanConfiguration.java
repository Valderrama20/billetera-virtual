package billeteraVirtual.infrastructure.config;

import billeteraVirtual.application.services.UserService;
import billeteraVirtual.infrastructure.adapters.output.UserListRepositoryPortAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public UserService createUserService(){
        return new UserService(new UserListRepositoryPortAdapter());
    }
}
