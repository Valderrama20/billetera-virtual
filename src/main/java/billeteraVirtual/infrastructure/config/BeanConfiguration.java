package billeteraVirtual.infrastructure.config;

import billeteraVirtual.application.services.CreateUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateUserService createUserService(){
        return new CreateUserService();
    }
}
