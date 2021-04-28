package com.kodilla.collections.interfaces.homework;

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
}
