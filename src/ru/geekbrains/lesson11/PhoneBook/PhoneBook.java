package ru.geekbrains.lesson11.PhoneBook;

import java.sql.SQLOutput;
import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> book;
    private List<String> TemporaryList;

    public PhoneBook() {
        book = new HashMap<>();
        TemporaryList = new ArrayList<>();
    }

    public void add(String name, String number) {

        if (book.containsKey(name)) {
            TemporaryList = book.get(name);
            TemporaryList.add(number);
            book.put(name, TemporaryList);
        } else {
            List<String> workList = new ArrayList<>();
            workList.add(number);
            book.put(name, workList);
        }
    }

    public Map<String, List<String>> getMap() {

        return book;
    }

    public void printPhone(String name) {
        int count = 1;
        if (book.containsKey(name)) {
            System.out.println("Найдены следующие номера контакта "+name);
            for (String s : book.get(name)) {
                System.out.println(count+" - "+s);
                count++;
            }


        }
    }

}
