package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
       return args ->
       {
           Student mariam = new Student(

                   "mariam",

                   "maria@gmail.com",
                   LocalDate.of(2000, Month.JANUARY, 5)


           );


           Student ali = new Student(

                   "ali",

                   "ali@gmail.com",
                   LocalDate.of(1999, Month.APRIL, 5)


           );

           repository.saveAll(
                   List.of(mariam,ali)
           );
       };
    }

}
