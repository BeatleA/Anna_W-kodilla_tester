package com.kodilla.stream.extra;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "Smith", 30, Gender.MALE, "Software Developer", 44000, Contract.FULL),
                new Employee("Anne", "Shirley", 20, Gender.FEMALE, "Software Engineer", 25000, Contract.HALF),
                new Employee("Piotr", "Czajkowski", 20, Gender.MALE, "Accountant", 31000, Contract.HALF),
                new Employee("Laura", "Raab", 53, Gender.FEMALE, "HR Manager", 48300, Contract.FULL),
                new Employee("Martha", "Parker", 18, Gender.FEMALE, "Receptionist", 4800, Contract.HALF),
                new Employee("Luke", "Carter", 50, Gender.MALE, "Software Developer", 60100, Contract.FULL),
                new Employee("Maria", "Kowalska", 45, Gender.FEMALE, "Software Tester", 41000, Contract.FULL),
                new Employee("John", "Meyer", 47, Gender.MALE, "Sales Specialist", 26000, Contract.FULL)
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

        //Zad 12
        System.out.println("\nNumber of people earning more than 5000");
        long count = employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .count();
        System.out.println(count);

        //Zad 13
        System.out.println("\nAverage salaries of full-time/part-time employees");
        double fullTimeAverage = employees.stream()
                .filter(e -> e.getContractType()==Contract.FULL)
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
        double partTimeAverage = employees.stream()
                .filter(e -> e.getContractType()==Contract.HALF)
                .mapToDouble(Employee:: getSalary)
                .average()
                .getAsDouble();
        System.out.printf("%.2f/%.2f\n",fullTimeAverage, partTimeAverage);

        //Zad 14a,b
        System.out.println("\nFirst names and their frequency");
        Map<String,Long> firstNames = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getFirstName(),
                        Collectors.counting()));
        for (Map.Entry<String, Long> name : firstNames.entrySet()) {
            System.out.println(name.getKey() + ":" + name.getValue().toString());
        }

        //Zad 14c
        System.out.println("\nFirst names ending in a and their frequency");
        firstNames = employees.stream()
                .filter(e -> e.getFirstName().endsWith("a"))
                .collect(Collectors.groupingBy(e -> e.getFirstName(),
                        Collectors.counting()));
        for (Map.Entry<String, Long> name : firstNames.entrySet()) {
            System.out.println(name.getKey() + ":" + name.getValue().toString());
        }

        //Zad 14d
        System.out.println("\nFirst names and their frequency as Integer");
        Map<String,Integer> names = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getFirstName(),
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
        for (Map.Entry<String, Integer> name : names.entrySet()) {
            System.out.println(name.getKey() + ":" + name.getValue().toString());
        }

        //Zad 14
        System.out.println("\nA person with the highest salary");
        Employee highestEarner = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println(highestEarner.getFirstName() + " " + highestEarner.getLastName());

        //Zad 15
        System.out.println("\nThe lowest earner's profession");
        Employee lowestEarner = employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println(lowestEarner.getProfession());
        System.out.println("\nThe highest earner's profession");
        System.out.println(highestEarner.getProfession());

        //Zad 16
        System.out.println("\nWomen's average salaries");
        Double average = employees.stream()
                .filter(e -> e.getGender()==Gender.FEMALE)
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
        System.out.println(average);

        //Zad 17
        System.out.println("\nMen's average salaries");
        average = employees.stream()
                .filter(e -> e.getGender()==Gender.MALE)
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
        System.out.println(average);

        //Zad 18
        System.out.println("\nPeople whose first name starts with L, grouped by surname");
        Map<String, List<Employee>> lNames = employees.stream()
                .filter(e -> e.getFirstName().startsWith("L"))
                .collect(Collectors.groupingBy(Employee::getLastName));
        for (Map.Entry<String, List<Employee>> lName : lNames.entrySet()) {
            System.out.println(lName.getKey() + ":");
            for (Employee employee:lName.getValue()) {
                System.out.println("\t" + employee.getFirstName());
            }
        }

    }
}
