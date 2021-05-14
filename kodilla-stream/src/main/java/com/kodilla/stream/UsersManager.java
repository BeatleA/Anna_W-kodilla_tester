package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getUsername())
                .forEach(un -> System.out.println(un));

        UsersRepository.getUsersList()
                .stream()
                .map(UsersManager::getUserName)
                .forEach(un -> System.out.println(un));

        UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .forEach(un -> System.out.println(un));

        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}