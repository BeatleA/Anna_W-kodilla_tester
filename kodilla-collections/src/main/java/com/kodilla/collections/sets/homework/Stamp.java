package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double height;
    private boolean marked;

    public Stamp(String name, double width, double height, boolean marked) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.marked = marked;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarked() {
        return marked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 && Double.compare(stamp.height, height) == 0 && marked == stamp.marked && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, marked);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", marked=" + marked +
                '}';
    }
}
