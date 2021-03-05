package ru.geekbrains.Java3.Lesson1.Task3;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box;
    private float weight;
    private int count;


    public float getWeight() {
        weight = 0f;
        for (T t : box) {
            weight += t.getWeight();
        }
        return weight;
    }

    public int getCount() {
        count = 0;
        for (T t : box) {
            count++;
        }
        return count;
    }

    public Box() {
        count = 0;
        weight = 0f;
        box = new ArrayList<>();
    }


    public void put(T t) {
        box.add(t);
    }

    public void putIN(Box<T> b) {
            b.box.addAll(this.box);
            this.box.clear();
    }


    public boolean compareTo(Box b) {
        if (this.getWeight() == b.getWeight()) {
            return true;
        }
        return false;
    }
}


