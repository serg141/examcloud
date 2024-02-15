package ru.sergey.examclouds;

public class Main {
    public static void main(String[] args) {
        int x, y, z;
        Number number = new Number();
        Input input = new Input();
        GenerateNumber generateNumber = new GenerateNumber();
        ArrayS arrayS = new ArrayS();

        arrayS.stringArray();
        arrayS.doubleArray();
        arrayS.arrayArray();
        arrayS.intArray();
        System.out.println();

        x = generateNumber.generateNumber();
        number.factorial(x);

        x = input.inputNumber();
        number.integer(x);
        number.checkNumber(x);

        System.out.println();

        y = input.inputNumber();
        z = input.inputNumber();

        System.out.println();

        number.sum(x, y);
        number.difference(x, y);
        number.product(x, y);
        number.minNumber(x, y, z);
        number.average(x, y, z);

        System.out.println();

        x = input.inputNumberForDay();
        number.checkDay(x);

        System.out.println();
        number.strings();
        System.out.println();
        number.multiplesOfFive();
        System.out.println();
        number.printLetters();
    }
}