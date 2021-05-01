package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Toyota implements Car {
    private int speed;

    public Toyota(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 6;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return speed == toyota.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
