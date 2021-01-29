package ru.geekbrains.lesson5;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void GetInfo() {
        System.out.println("Имя: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Почта: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Валерий Игоревич", "Бухгалтер", "val@mail.ru", "+79887567849", 250000, 55);
        persArray[1] = new Person("Коваленко Иван Андреевич", "Системный администратор", "kova12@mail.ru", "+79889056078", 160000, 25);
        persArray[2] = new Person("Петренко Василий Олегович", "Программист", "VasyaPupkin@mail.ru", "+79885678787", 300000, 26);
        persArray[3] = new Person("Андреев Андрей Андреевич", "Аналитик", "annnn111@mail.ru", "+79889056969", 100000, 40);
        persArray[4] = new Person("Усама Бен Ладен", "Общественный деятель", "noemail@mail.ru", "+79889052208", 0, 54);

        for (Person p : persArray) {
            if(p.age > 40)
            p.GetInfo();
        }

    }


}
