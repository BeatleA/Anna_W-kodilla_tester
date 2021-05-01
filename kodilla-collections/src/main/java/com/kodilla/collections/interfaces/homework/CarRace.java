package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {
        Car mercedes = new Mercedes(5);
        doRace(mercedes);

        Car toyota = new Toyota(5);
        doRace(toyota);

        Car ford = new Ford(5);
        doRace(ford);
    }

    private static void doRace(Car car) {
        for (int i=0; i < 3; i++) {
            car.increaseSpeed();
        }
        for (int i=0; i < 2; i++) {
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
