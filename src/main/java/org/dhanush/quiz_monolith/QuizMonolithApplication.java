package org.dhanush.quiz_monolith;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuizMonolithApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizMonolithApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper(){
    return new ModelMapper();
    }

}
