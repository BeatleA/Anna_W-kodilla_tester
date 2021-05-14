package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Prepare a presentation", LocalDate.of(2021,3,1), LocalDate.of(2021, 4, 20)));
        tasks.add(new Task("Write a report", LocalDate.now(), LocalDate.of(2021, 6, 15)));
        tasks.add(new Task("Schedule a meeting with Chris", LocalDate.now(), LocalDate.of(2021, 5, 14)));
        tasks.add(new Task("Call Martin", LocalDate.of(2021,3,10), LocalDate.of(2021, 3, 14)));
        tasks.add(new Task("Prepare a mail template", LocalDate.now(), LocalDate.of(2021, 7, 4)));
        tasks.add(new Task("Schedule a team meeting", LocalDate.now(), LocalDate.of(2021, 5, 17)));
        return tasks;
    }
}
