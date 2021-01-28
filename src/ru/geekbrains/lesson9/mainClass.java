package ru.geekbrains.lesson9;

import ru.geekbrains.lesson9.model.*;

public class mainClass {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 2, 10, 1.2);
        cats[1] = new Cat("Васька", 3, 55, 4);
        cats[2] = new Cat("Путин", 6, 140, 2);


        Human[] humans = new Human[3];
        humans[0] = new Human("Адольф", 88, 200, 1.4);
        humans[1] = new Human("Иосиф", 44, 100, 1.5);
        humans[2] = new Human("Владимир", 13, 50, 0.3);

        Robot[] robots = new Robot[3];
        robots[0] = new Robot("XF-341", 2, 500, 0.2);
        robots[1] = new Robot("SQ-221", 3, 50, 1.5);
        robots[2] = new Robot("XU-001", 3, 5, 50);


        Wall[] walls = new Wall[3];
        walls[0] = new Wall(1.3);
        walls[1] = new Wall(0.3);
        walls[2] = new Wall(0.9);

        Treadmill[] trd = new Treadmill[3];
        trd[0] = new Treadmill(120);
        trd[1] = new Treadmill(150);
        trd[2] = new Treadmill(170);

        System.out.println("Дистанция людей-----------------------------------------------");
        for (int i = 0; i < humans.length; i++) {
            System.out.println();
            if (humans[i].getActual()) {
                System.out.println(humans[i].toString());

                for (int w = 0; w < walls.length; w++) {
                    if (!humans[i].jump(walls[w].getHeight())) {
                        humans[i].setActual(false);
                        break;
                    }
                }
            }

            if (humans[i].getActual()) {
                for (int t = 0; t < trd.length; t++) {
                    if (!humans[i].run(trd[t].getDistance())) {
                        humans[i].setActual(false);
                        break;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Конец дистанции людей------------------------------------------");


        System.out.println();
        System.out.println("Дистанция котов-------------------------------------------------");
        for (int i = 0; i < cats.length; i++) {
            System.out.println();
            if (cats[i].getActual()) {
                System.out.println(cats[i].toString());

                for (int w = 0; w < walls.length; w++) {
                    if (!cats[i].jump(walls[w].getHeight())) {
                        cats[i].setActual(false);
                        break;
                    }
                }
            }

            if (cats[i].getActual()) {
                for (int t = 0; t < trd.length; t++) {
                    if (!cats[i].run(trd[t].getDistance())) {
                        cats[i].setActual(false);
                        break;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Конец дистанции котов------------------------------------------");

        System.out.println();
        System.out.println("Дистанция роботов-------------------------------------------------");
        for (int i = 0; i < robots.length; i++) {
            System.out.println();
            if (robots[i].getActual()) {
                System.out.println(robots[i].toString());

                for (int w = 0; w < walls.length; w++) {
                    if (!robots[i].jump(walls[w].getHeight())) {
                        robots[i].setActual(false);
                        break;
                    }
                }
            }

            if (cats[i].getActual()) {
                for (int t = 0; t < trd.length; t++) {
                    if (!robots[i].run(trd[t].getDistance())) {
                        robots[i].setActual(false);
                        break;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Конец дистанции роботов------------------------------------------");

    }
}
