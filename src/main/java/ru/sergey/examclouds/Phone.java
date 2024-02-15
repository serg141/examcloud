package ru.sergey.examclouds;

public class Phone {
    private int number, model, weight;

    public Phone(int number, int model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, int model) {
        this(number, model, 333);
    }

    public Phone() {
    }

    public int getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall (String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall (String name, String call) {
        System.out.println("Звонит " + name + " Номер " + call);
    }
}
