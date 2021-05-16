package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

import java.util.OptionalDouble;

public class ForumStats {
    public static void main(String[] args) {
        Double avg = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()>=40)
                .map(u -> u.getNumberOfPost())
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts by users aged 40+: " + avg);

        avg = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()<40)
                .map(u -> u.getNumberOfPost())
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts by users under 40: " + avg);
    }
}
