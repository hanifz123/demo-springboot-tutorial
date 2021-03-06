package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student maul = new Student(
                    "Maul culun",
                    "maul.culun@gmail.com",
                    LocalDate.of(1997, JANUARY, 5)
            );

            Student adi = new Student(
                    "Adi culun",
                    "adi.culun@gmail.com",
                    LocalDate.of(1990, JANUARY, 5)
            );

            repository.saveAll(
                    List.of(maul, adi)
            );
        };
    }
}
