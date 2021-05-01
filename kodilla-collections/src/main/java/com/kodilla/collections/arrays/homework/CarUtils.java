package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car make: " + getCarMake(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarMake(Car car) {
        if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car";
    }
}
