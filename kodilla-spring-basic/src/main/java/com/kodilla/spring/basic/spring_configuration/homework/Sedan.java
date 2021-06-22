package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        return time.compareTo(LocalTime.of(20,0))>=0 || time.compareTo(LocalTime.of(6, 0))<=0;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
