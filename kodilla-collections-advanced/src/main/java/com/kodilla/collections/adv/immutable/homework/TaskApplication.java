package com.kodilla.collections.adv.immutable.homework;

public class TaskApplication {
    public static void main(String[] args) {
        Task task = Task.of("Bathroom cleaning", 40);
        System.out.println(task.getTitle() + " will take " + task.getDuration() + " minutes.");

        Task anotherTask = Task.of("Cooking dinner", 30);
        System.out.println(anotherTask.getTitle() + " will take " + anotherTask.getDuration() + " minutes.");
    }
}
