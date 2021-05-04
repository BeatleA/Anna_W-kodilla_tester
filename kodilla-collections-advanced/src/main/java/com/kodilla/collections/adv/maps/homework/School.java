package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> classSizes = new ArrayList<>();

    public School(String name, int... classSizes) {
        this.name = name;
        for (int size : classSizes)
            this.classSizes.add(size);
    }

    public int getNumberOfStudents(){
        int numberOfStudents = 0;
        for (int size : classSizes)
            numberOfStudents += size;
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
