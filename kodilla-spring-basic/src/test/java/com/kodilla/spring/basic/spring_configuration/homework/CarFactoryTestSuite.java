package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
class CarFactoryTestSuite {

    @Test
    public void shouldChooseCarDependingOnSeason(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar", "winter");
        //When
        String carType = car.getCarType();
        //Then
        Assertions.assertEquals("SUV", carType);

        //Given
        car = (Car) context.getBean("chooseCar", "summer");
        //When
        carType = car.getCarType();
        //Then
        Assertions.assertEquals("Cabrio", carType);

        //Given
        car = (Car) context.getBean("chooseCar", "autumn");
        //When
        carType = car.getCarType();
        //Then
        Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void shouldSwitchHeadlightsDependingOnTime(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar", "summer");
        //When
        boolean hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(21,35));
        //Then
        Assertions.assertTrue(hasHeadlightsTurnedOn);

        //Given
        car = (Car) context.getBean("chooseCar", "winter");
        //When
        hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(4,11));
        //Then
        Assertions.assertTrue(hasHeadlightsTurnedOn);

        //Given
        car = (Car) context.getBean("chooseCar", "spring");
        //When
        hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(20,0));
        //Then
        Assertions.assertTrue(hasHeadlightsTurnedOn);

        //Given
        car = (Car) context.getBean("chooseCar", "autumn");
        //When
        hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(15,15));
        //Then
        Assertions.assertFalse(hasHeadlightsTurnedOn);

        //When
        hasHeadlightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(6,1));
        //Then
        Assertions.assertFalse(hasHeadlightsTurnedOn);
    }
}