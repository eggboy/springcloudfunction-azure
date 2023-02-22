package io.jaylee.function.springfunction.repository;

import io.jaylee.function.springfunction.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User, String> {
}
