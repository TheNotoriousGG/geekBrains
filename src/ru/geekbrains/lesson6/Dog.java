package ru.geekbrains.lesson6;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name, String color, int age, int metersMax, double heightMax, int swimMax) {
        super(name, color, age, metersMax, heightMax, swimMax);

        dogCount++;
    }

    public static int Count() {
        return dogCount;
    }


}
