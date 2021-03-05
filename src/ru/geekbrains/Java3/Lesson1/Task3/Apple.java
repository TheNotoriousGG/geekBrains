package ru.geekbrains.Java3.Lesson1.Task3;

public class Apple extends Fruit {
    private final float WEIGHT;

    public Apple() {
        this.WEIGHT = 1.0f;
    }

    @Override
    float getWeight() {
        return this.WEIGHT;
    }
}
