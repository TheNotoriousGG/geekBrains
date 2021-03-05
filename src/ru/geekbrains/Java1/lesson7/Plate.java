package ru.geekbrains.Java1.lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        this.food += food;
    }

    public boolean decreaseFood(int appetite) {
        int difference = this.food - appetite;

        if (this.food >= appetite) {
            this.food -= appetite;
            return true;
        } else {
            System.out.println("Add " + difference * -1 + " meals to feed");
            return false;
        }
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
