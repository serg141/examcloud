package ru.sergey.examclouds;

public class Number {
    public void integer(int a) {
        if (a % 2 == 0) System.out.println(a + " - even");
        else System.out.println(a + " - odd");
    }

    public void sum(int a, int b) {
        int c = a + b;
        System.out.println("Summa = " + c);
    }

    public void difference(int a, int b) {
        int c = a - b;
        System.out.println("Difference = " + c);
    }

    public void product(int a, int b) {
        int c = a * b;
        System.out.println("Product = " + c);
    }

    public void minNumber(int a, int b, int c) {
        int min = c;
        if (Math.abs(a) <= Math.abs(b) && Math.abs(a) <= Math.abs(c)) min = a;
        else if (Math.abs(b) <= Math.abs(a) && Math.abs(b) < Math.abs(c)) min = b;

        System.out.println("Min = " + min);
    }

    public void average(int a, int b, int c) {
        double avg = (double) (a + b + c) / 3;
        System.out.println("Average = " + avg);
    }

    public void checkNumber(int a) {
        if (a >= 0 && a <= 10) System.out.println("Положительное число меньше 10 или ноль");
        else System.out.println("Положительное число больше 10 или отрицательное");
    }

    public void checkDay(int a) {
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходной");
                break;
        }
    }

    public void strings() {
        int i = 1;
        while (i < 11) {
            System.out.print("Task" + i + " ");
            i++;
        }
    }

    public void multiplesOfFive() {
        int i = 1;
        do {
            if (i % 5 == 0) System.out.print(i + " ");
            i++;
        } while (i < 101);
    }

    public void printLetters() {
        char[] letters = {'h', 'i', 'g', 'k', 'l'};
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
    }

    public void factorial(int a) {
        int x = 1;
        if (a != 0) {
            for (int i = 1; i < a; i++) {
                x = x * (i + 1);
            }

            System.out.println(a + "! = " + x);
        }
        else System.out.println("0! = 1");
    }
}
