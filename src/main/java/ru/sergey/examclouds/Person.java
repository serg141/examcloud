package ru.sergey.examclouds;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk() {
        System.out.println("Такой то " + fullName + " говорит");
    }

    public void move() {
        System.out.println("Такой то " + age + " говорит");
    }
}
