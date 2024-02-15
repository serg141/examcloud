package ru.sergey.examclouds;

public class GenerateNumber {
    public int generateNumber() {
        return (int) (Math.random() * 5);
    }

    public int generateInt() {
        return (int) (Math.random() * 100);
    }

    public double generateDouble() {
        return Math.random();
    }
}
