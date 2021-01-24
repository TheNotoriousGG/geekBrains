package ru.geekbrains.lesson7;

public class TestEatCat {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Belka",5);
        cats[1] = new Cat("Persik",8);
        cats[2] = new Cat("Hleb",6);
        cats[3] = new Cat("Stepa",9);
        cats[4] = new Cat("Adolf",12);

        Plate plate = new Plate(12);

        for (Cat cat: cats
             ) {
            cat.info();
            plate.info();
            cat.eat(plate);
            plate.info();
            cat.info();
            plate.setFood(cat.getAppetite());
            System.out.println("==============================");
        }

        //Задание 2
        stringWork("I Like Java!!!");

    }
    public static void stringWork(String string){
        System.out.println(string);
        System.out.println("Last char: "+string.charAt(string.length()-1));
        System.out.println("if ends with [!!!] -->"+string.endsWith("!!!"));
        System.out.println("if starts with[I Like] -->"+string.startsWith("I Like"));
        System.out.println("index of [Java] -->"+string.indexOf("Java"));
        System.out.println("replace a -> o -->"+string.replace('a','o'));
        System.out.println("to upper case -->"+string.toUpperCase());
        System.out.println("to lower case -->"+string.toLowerCase());
        System.out.println("substr java -->"+string.substring(7,11));

    }
}
