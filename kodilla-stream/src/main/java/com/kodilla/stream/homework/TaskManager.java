package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> currentDeadlines = TaskRepository.getTasks()
                .stream()
                .filter(d -> (d.getDeadline().isAfter(LocalDate.now().minusDays(1))))
                .map(Task::getDeadline)
                .collect(Collectors.toList());
        System.out.println(currentDeadlines);
    }
}
