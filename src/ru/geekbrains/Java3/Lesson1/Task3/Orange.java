package ru.geekbrains.Java3.Lesson1.Task3;

public class Orange extends Fruit {
    private final float WEIGHT;

    public Orange() {
        this.WEIGHT = 1.5f;
    }

    @Override
    float getWeight() {
        return this.WEIGHT;
    }
}
