package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    private final String title;
    private final int duration;

    private Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public static Task of(String title, int duration){
        return new Task(title,duration);
    }

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }
}
