package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Windows windows10 = new Windows(2015);
        Linux ubuntuFocalFossa = new Linux(2020);

        windows10.turnOn();
        windows10.turnOff();
        ubuntuFocalFossa.turnOff();
        ubuntuFocalFossa.turnOff();
    }
}
