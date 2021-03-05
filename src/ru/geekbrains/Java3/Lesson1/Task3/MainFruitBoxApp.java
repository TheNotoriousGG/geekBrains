package ru.geekbrains.Java3.Lesson1.Task3;

public class MainFruitBoxApp {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<Orange>();
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());
        orangeBox.put(new Orange());

        Box<Apple> appleBox = new Box<Apple>();
        appleBox.put(new Apple());
        appleBox.put(new Apple());
        appleBox.put(new Apple());
        appleBox.put(new Apple());


        Box<Apple> appleBox2 = new Box<Apple>();

        System.out.println("Равны ли ящики?: " + appleBox.compareTo(orangeBox));

        System.out.println("Ящик с апельсинами: кол-во: " + orangeBox.getCount() + ", Вес: " + orangeBox.getWeight());
        System.out.println("Ящик с яблоками: кол-во: " + appleBox.getCount() + ", Вес: " + appleBox.getWeight());
        System.out.println("Ящик с яблоками1: кол-во: " + appleBox2.getCount() + ", Вес: " + appleBox2.getWeight());

        appleBox.putIN(appleBox2);

        System.out.println("Ящик с апельсинами: кол-во: " + orangeBox.getCount() + ", Вес: " + orangeBox.getWeight());
        System.out.println("Ящик с яблоками: кол-во: " + appleBox.getCount() + ", Вес: " + appleBox.getWeight());
        System.out.println("Ящик с яблоками1: кол-во: " + appleBox2.getCount() + ", Вес: " + appleBox2.getWeight());
    }
}
