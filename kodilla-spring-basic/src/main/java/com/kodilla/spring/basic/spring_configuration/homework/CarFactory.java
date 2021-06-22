package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarFactory {

    @Bean
    @Scope("prototype")
    public Car chooseCar(String season){
        switch (season) {
            case "summer":
                return new Cabrio();
            case "winter":
                return new SUV();
            default:
                return new Sedan();
        }
    }
}
