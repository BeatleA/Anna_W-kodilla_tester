package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Penny Black",19,22,true));
        stamps.add(new Stamp("Bull's Eye", 19, 19, false));
        stamps.add(new Stamp("Inverted Jenny", 23, 20, true));
        stamps.add(new Stamp("Bull's Eye", 19, 19, false));

        System.out.println("Stamp Set size: " + stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
