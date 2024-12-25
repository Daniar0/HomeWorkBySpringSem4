package com.example.HomeWorkBySem4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {repository.save(new User("Aidar","aidar@example.com"));
            repository.save(new User("Erbol","erbol@example.com"));
        };
    }
}
