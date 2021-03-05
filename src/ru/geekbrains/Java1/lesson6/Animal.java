package ru.geekbrains.Java1.lesson6;

public abstract class Animal {

    private final int metersMax;
    private final double heightMax;
    private final int swimMax;
    protected final String name;
    protected final String color;
    protected int age;
    private static int animalCount;


    public Animal(String name, String color, int age,int metersMax,double heightMax,int swimMax) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.metersMax = metersMax;
        this.heightMax = heightMax;
        this.swimMax = swimMax;


        animalCount++;

    }

    protected void run(int meters){
        String result = meters <= metersMax ? " run(" + meters + ")" + " -->true" : " run(" + meters + ")" + " -->false";
        System.out.println(result);
    };

    protected void swim(int meters){
        String result = meters <= swimMax ? " swim(" + meters + ")" + " -->true" : " swim(" + meters + ")" + " -->false";
        System.out.println(result);
    };

    protected void jump(int height){
        String result = height <= heightMax ? " jump(" + height + ")" + " -->true" : " jump(" + height + ")" + " -->false";
        System.out.println(result);
    };

    @Override
    public String toString() {
        String res = "{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';

        return this.getClass().getSimpleName() + res;
    }

    public static int Count(){
        return animalCount;
    };
}
