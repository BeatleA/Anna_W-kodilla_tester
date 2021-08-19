package com.kodilla.jacoco;

public class Year {
    int chosenYear;

    public Year(int year) {
        this.chosenYear = year;
    }

    public boolean isLeap() {
        if (this.chosenYear % 4 == 0) {
            if (this.chosenYear % 100 == 0) {
                return (this.chosenYear % 400 == 0);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}