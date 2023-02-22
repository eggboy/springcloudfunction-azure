package io.jaylee.function.springfunction;

import io.jaylee.function.springfunction.model.User;
import io.jaylee.function.springfunction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
public class SpringFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFunctionApplication.class, args);
	}

}
