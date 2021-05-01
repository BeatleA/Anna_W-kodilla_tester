package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(5));
        cars.add(new Toyota(3));
        cars.add(new Mercedes(7));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("\nCar List size: " + cars.size());

        cars.remove(0);
        cars.remove(new Mercedes(7));

        System.out.println();
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("\nCar List size: " + cars.size());
    }
}
