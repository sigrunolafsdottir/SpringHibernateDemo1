package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.demo.models.*;
import com.example.demo.repositories.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

/*
    @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
            // save a few books
            repository.save(new Book("Sagan om Ringen", "Tolkien"));
            repository.save(new Book("Sagan om de två tornen", "Tolkien"));
            repository.save(new Book("Sagan om Konungens återkomst", "Tolkien"));
            repository.save(new Book("Ronja Rövardotter", "Astrid Lindgren"));
            repository.save(new Book("Lotta på Bråkmakargatan", "Astrid Lindgren"));

        };
    }
*/
}
