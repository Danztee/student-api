package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Daniel = new Student(
                    "Daniel",
                    "daniel@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 20)


            );

            Student Alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 20)

            );

            repository.saveAll(List.of(Daniel, Alex));
        };
    }
}
