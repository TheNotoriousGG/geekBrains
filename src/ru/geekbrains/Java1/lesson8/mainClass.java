package ru.geekbrains.Java1.lesson8;


public class mainClass {
    public static final int SIZE = 5;
    public static int width = 500;
    public static int height = 500;

    public static void main(String[] args) {
        new MyWindow(width, height, SIZE);
    }
}
