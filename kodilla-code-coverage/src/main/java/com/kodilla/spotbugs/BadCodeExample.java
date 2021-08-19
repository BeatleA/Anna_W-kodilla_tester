package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    private final String type;

    public BadCodeExample(String type) {
        this.type = type;
    }

    public static double getPi() {
        return Math.PI;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BadCodeExample badCodeExample = (BadCodeExample) o;

        return getType().equals(badCodeExample.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}