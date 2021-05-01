package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Mercedes implements Car {
    private int speed;

    public Mercedes(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 10;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mercedes mercedes = (Mercedes) o;
        return speed == mercedes.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
