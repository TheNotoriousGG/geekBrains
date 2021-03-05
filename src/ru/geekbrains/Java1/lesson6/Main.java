package ru.geekbrains.Java1.lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int metersMax = r.nextInt(200);
        int heightMax = r.nextInt(15);
        int swimMax = r.nextInt(2);

        Animal catLarisa = new Cat("Лариса","Black",5,150,2.5,swimMax);
        System.out.println(catLarisa.toString());
        catLarisa.run(100);
        catLarisa.swim(43);
        catLarisa.jump(3);

        Animal dogShar = new Dog("Шар","white",5,metersMax,heightMax,swimMax);
        System.out.println(dogShar.toString());
        dogShar.run(100);
        dogShar.swim(43);
        dogShar.jump(6);


        System.out.println("Общее кол-во животных: "+Animal.Count());
        System.out.println("Общее кол-во кошек: "+Cat.Count());
        System.out.println("Общее кол-во собак: "+Dog.Count());


    }
}

