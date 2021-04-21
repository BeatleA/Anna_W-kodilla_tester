package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int releaseYear){
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows operating system was turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows operating system was turned off");
    }
}
