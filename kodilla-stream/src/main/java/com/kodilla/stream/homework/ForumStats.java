package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()>=40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts by users aged 40+: " + avg);

        avg = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()<40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts by users under 40: " + avg);
    }
}
