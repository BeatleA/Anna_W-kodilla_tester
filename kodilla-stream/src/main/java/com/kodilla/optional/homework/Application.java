package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Smith", new Teacher("Mick Stone")));
        students.add(new Student("Mary Small", new Teacher("Peter Henderson")));
        students.add(new Student("Steven Stevenson", null));
        students.add(new Student("Frank Robinson", new Teacher("Glenda Blake")));
        students.add(new Student("Susan Blanks", null));

        for (Student student: students) {
            System.out.println("student: " + student.getName() + ", teacher: "
                    + Optional.ofNullable(student.getTeacher()).orElse(new Teacher("<undefined>")).getName());
        }
    }
}
