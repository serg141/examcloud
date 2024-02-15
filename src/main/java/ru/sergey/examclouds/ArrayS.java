package ru.sergey.examclouds;

import java.util.Arrays;

public class ArrayS {
    private final GenerateNumber generateNumber = new GenerateNumber();

    public void stringArray() {
        String[] array = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        System.out.println(array[6]);
    }

    public void doubleArray() {
        double[] numbers = new double[4];
        for (int i = 0; i < 4; i++) numbers[i] = generateNumber.generateDouble();
        System.out.println(numbers[0]);
    }

    public void arrayArray() {
        String[][] abc = new String[3][6];

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                for (int j = 0; j < 6; j++) {
                    abc[i][j] = "a" + (j + 1);
                }
            }
            else if (i == 1) {
                for (int j = 0; j < 6; j++) {
                    abc[i][j] = "b" + (j + 1);
                }
            }
            else {
                for (int j = 0; j < 6; j++) {
                    abc[i][j] = "c" + (j + 1);
                }
            }
        }

        System.out.println(Arrays.deepToString(abc));
    }

    public void intArray() {
        int[][] numbers = new int[5][8];
        int[][] minmax = new int[5][2];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                numbers[i][j] = generateNumber.generateInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            int min = numbers[i][0];
            int max = numbers[i][0];
            for (int j = 0; j < 8; j++) {
                if (max < numbers[i][j]) max = numbers[i][j];
                if (min > numbers[i][j]) min = numbers[i][j];
            }
            minmax[i][0] = max;
            minmax[i][1] = min;
        }

        System.out.println(Arrays.deepToString(minmax));
    }
}
