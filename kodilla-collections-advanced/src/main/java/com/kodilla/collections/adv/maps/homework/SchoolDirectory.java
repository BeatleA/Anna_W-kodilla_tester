package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> school = new HashMap<>();

        Principal smith = new Principal("Jane Smith");
        Principal crawford = new Principal("Alan Crawford");
        Principal stevenson = new Principal("Matthew Stevenson");

        School stChristopher = new School("St Christopher's Primary School",30, 26, 27, 30, 29, 23, 21);
        School ourLady = new School("Our Lady's Primary School",20, 28, 30, 30, 28, 30, 30);
        School larkrise = new School("Larkrise Primary School",19, 20, 17, 20);

        school.put(smith, stChristopher);
        school.put(crawford, ourLady);
        school.put(stevenson, larkrise);

        for (Map.Entry<Principal,School> schoolEntry : school.entrySet()) {
            System.out.println(schoolEntry.getKey().getName() + " is the principal of " + schoolEntry.getValue() +
                    ". Number of students in the school: " + schoolEntry.getValue().getNumberOfStudents());
        }
    }
}
