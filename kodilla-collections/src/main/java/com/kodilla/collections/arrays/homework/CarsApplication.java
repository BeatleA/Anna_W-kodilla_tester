package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarMake = random.nextInt(3);
        int drawnSpeed = random.nextInt(50);
        if (drawnCarMake == 0)
            return new Mercedes(drawnSpeed);
        else if (drawnCarMake == 1)
            return new Toyota(drawnSpeed);
        else
            return new Ford(drawnSpeed);
    }
}
