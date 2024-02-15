package ru.sergey.examclouds;

import java.util.ArrayList;
import java.util.Arrays;

public class Reader {

    ArrayList<String> reader = new ArrayList<>();

    public void takeBook(int book) {
        System.out.println("Петров В.В. взял " + book + " книг(и).");
    }

    public void takeBook(String... array ) {
        System.out.println("Петров В.В. взял книгу(и): " + Arrays.toString(array));
    }

    public void returnBook(int book) {
        System.out.println("Петров В.В. вернул " + book + " книг(и).");
    }

    public void returnBook(String... array) {
        System.out.println("Петров В.В. вернул книгу(и): " + Arrays.toString(array));
    }
}
