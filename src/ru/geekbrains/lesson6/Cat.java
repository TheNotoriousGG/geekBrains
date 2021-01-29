package ru.geekbrains.lesson6;


public class Cat extends Animal {
    private static int catCount;

    public Cat(String name, String color, int age,int metersMax,double heightMax,int swimMax) {
        super(name, color, age,metersMax,heightMax,swimMax);

        catCount++;
    }

    @Override
    protected void swim(int meters) {
        System.out.println(" I can't swim ;(");
    }


    public static int Count(){
        return catCount;
    };
}
