package com.kodilla.stream.extra;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("John", "Smith", 30, "Software Developer", 44000, Contract.FULL),
                new Employee("Anne", "Shirley", 20, "Software Engineer", 25000, Contract.HALF),
                new Employee("Piotr", "Czajkowski", 20, "Accountant", 31000, Contract.HALF),
                new Employee("Laura", "Raab", 53, "HR Manager", 48300, Contract.FULL),
                new Employee("Luke", "Carter", 50, "Software Developer", 60100, Contract.FULL),
                new Employee("Maria", "Kowalska", 45, "Software Tester", 41000, Contract.FULL)
        );

        // Zad 1
        System.out.println("\nEmployees with salary in range 15000-44999");
        employees.stream()
                .filter(e -> e.getSalary() >= 15000 && e.getSalary() < 45000)
                .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));

        //Zad 2
        System.out.println("\nEmployees with even age");
        employees.stream()
                .filter(e -> e.getAge()%2==0)
                .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));

        //Zad 3
        System.out.println("\nEmployees with surname ending in ska who work full-time");
        employees.stream()
                .filter(e -> e.getLastName().endsWith("ska") && e.getContractType().equals(Contract.FULL))
                .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));

        //Zad 4
        System.out.println("\nAll employees' first names");
        employees.stream()
                .map(e -> e.getFirstName())
                .forEach(System.out::println);

        //Zad 5
        System.out.println("\nThe three last letters of the surname if it ends with ski/ska, in capitals");
        employees.stream()
                .filter(e -> e.getLastName().endsWith("ski") || e.getLastName().endsWith("ska"))
                .map(e -> e.getLastName())
                .map(n -> n.substring(n.length()-3).toUpperCase())
                .forEach(System.out::println);

        //Zad 6
        System.out.println("\nAll employees' professions, in capital letters");
        employees.stream()
                .map(e -> e.getProfession().toUpperCase())
                .forEach(System.out::println);

        //Zad 7
        System.out.println("\n'Kowalski' is an employee:");
        boolean nameExists = employees.stream()
                .anyMatch(e -> e.getLastName().equals("Kowalski"));
        System.out.println(nameExists);

        //Zad 8 - surnames must be unique
        System.out.println("\n12% pay rise");
        Map<String, Double> payriseMap = employees.stream()
                .collect(Collectors.toMap(Employee::getLastName, e -> e.getSalary()*1.12));
        payriseMap.forEach((lastName, salary) -> System.out.println(lastName + ":" + salary));

        //Zad 9
        System.out.println("\nEmployees with a as second letter of their name and b as fourth letter of their surname");
        employees.stream()
                .filter(e -> e.getFirstName().charAt(1)=='a')
                .filter(e -> e.getLastName().charAt(3)=='b')
                .forEach(e -> System.out.println(e.getFirstName() + " " + e.getLastName()));

        //Zad 10
        System.out.println("\nEmployees sorted by surname, then first name");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName))
                .forEach(e -> System.out.println(e.getLastName() + " " + e.getFirstName()));

        //Zad 11
        System.out.println("\n{lastName,lastName}");
        employees.stream()
                .map(e -> e.getLastName())
                .forEach(ln -> System.out.println("{" + ln + "," + ln + "}"));
    }
}
