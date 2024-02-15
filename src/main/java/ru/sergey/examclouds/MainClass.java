package ru.sergey.examclouds;

public class MainClass {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1, 11, 111);
        Phone phone2 = new Phone(2, 22, 222);
        Phone phone3 = new Phone(3, 33, 333);

        Person person1 = new Person();
        Person person2 = new Person("Kim Kam In", 33);

        person1.age = 34;
        person1.fullName = "Din Don Dun";
        person1.talk();
        person1.move();
        person2.talk();
        person2.move();

        System.out.println();

        Reader reader = new Reader();
        reader.takeBook(3);
        reader.returnBook(1);
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader.returnBook("Приключения", "Энциклопедия");

        System.out.println();

        phone1.receiveCall("Sergey");
        phone2.receiveCall("Alex");
        phone3.receiveCall("John");
        phone1.receiveCall("Sergey", "8 999 888 77 66");

        System.out.println();

        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " " + phone3.getWeight());
    }
}
