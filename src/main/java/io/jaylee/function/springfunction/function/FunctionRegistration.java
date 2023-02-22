package io.jaylee.function.springfunction.function;

import io.jaylee.function.springfunction.model.User;
import io.jaylee.function.springfunction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;
import java.util.function.Function;

@Configuration
public class FunctionRegistration {
    @Autowired
    UserRepository userRepository;
    @Bean
    public Function<User, String> createUserFunction() {
        return user -> {
            userRepository.save(user);

            return user.getUserId();
        };
    }
    @Bean
    public Function<String, User> getUserFunction() {
        return userId -> {
            Optional<User> user = userRepository.findById(userId);

            return user.orElse(new User());
        };
    }
}
