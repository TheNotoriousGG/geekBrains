package ru.geekbrains.lesson7;

public class Cat {
    private final String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate){
        if(plate.decreaseFood(getAppetite())){
            System.out.println("cat " + this.name + " eated:)");
            this.satiety = true;

        }
    }

    public void info(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
