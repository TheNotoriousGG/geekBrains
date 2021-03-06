package ru.geekbrains.Java2.lesson9.model;



public class Robot {

    private final String name;
    private int age;
    private int maxRun;
    private double maxJump;
    private boolean isActual;

    public Robot(String name, int age,int maxRun,double maxJump) {
        if (age < 0) {
            System.out.println(age+" лет - Странный возраст для робота "+name);
            age = 7;
            System.out.println("Предположим ему было: "+age+" лет)");
        }

        this.name = name;
        this.age = age;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.isActual = true;
    }

    public void setActual(boolean actual) {
        isActual = actual;
    }
    public boolean getActual(){
        return isActual;
    }


    public boolean run(int distance) {
        if(distance <= maxRun){
            System.out.println("    "+name +" пробежал дистанцию "+distance+" метров)");
            return true;
        }else {
            System.out.println("    "+name +" не пробежал дистанцию "+distance+" метров и снят с дистанции");
            return false;
        }

    }

    public boolean jump(double height) {
        if(height <= maxJump){
            System.out.println("    "+name +" преодолел высоту "+height+" метров)");
            return true;
        }else {
            System.out.println("    "+name +" не преодолел высоту "+height+" метров и снят с дистанции");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Робот{" +
                "Имя='" + name + '\'' +
                ", Возраст=" + age +
                ", МаксДистанция=" + maxRun +
                ", МаксПрыжок=" + maxJump +
                '}';
    }


}
