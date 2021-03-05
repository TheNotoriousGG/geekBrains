package ru.geekbrains.Java2.lesson11.PhoneBook;

import java.util.List;
import java.util.Map;

public class PhoneBookMain {

    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();
        pb.add("Жора","7767406");
        pb.add("Жора","7767506");
        pb.add("Путин","9379992");
        pb.add("Гриша","88005553535");
        pb.add("Мария","9090909");
        pb.add("Мария","666777888");

        Map<String, List<String>> map = pb.getMap();

        pb.printPhone("Гриша");

        //:)

    }
}
