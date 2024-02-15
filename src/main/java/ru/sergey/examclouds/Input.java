package ru.sergey.examclouds;

import java.util.Scanner;

public class Input {
    public int inputNumber() {
        int a = 0;

        while (a == 0) {
            System.out.println("Input number");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) a = sc.nextInt();
            else System.out.println("InputMismatchException. Input number again");
        }

        return a;
    }

    public int inputNumberForDay() {
        int day = 0;

        System.out.println("Input number 1 - 7");

        while (day == 0) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                if (a > 0 && a < 8) day = a;
                else System.out.println("Input number 1 - 7, try again");
            }
            else System.out.println("InputMismatchException. Input number again");
        }

        return day;
    }
}
