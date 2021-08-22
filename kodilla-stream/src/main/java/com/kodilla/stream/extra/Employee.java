package com.kodilla.stream.extra;

public class Employee {
   private String firstName;
   private String lastName;
   private int age;
   private Gender gender;
   private String profession;
   private double salary;
   private Contract contractType;

    public Employee(String firstName, String lastName, int age, Gender gender, String profession, double salary, Contract contractType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
        this.salary = salary;
        this.contractType = contractType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getProfession() {
        return profession;
    }

    public double getSalary() {
        return salary;
    }

    public Contract getContractType() {
        return contractType;
    }
}
