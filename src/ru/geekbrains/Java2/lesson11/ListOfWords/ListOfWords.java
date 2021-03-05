package ru.geekbrains.Java2.lesson11.ListOfWords;

import java.util.*;

public class ListOfWords {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Алгоритм");
        words.add("Музыка");
        words.add("Техника");
        words.add("Величие");
        words.add("Джобс");
        words.add("Массоны");
        words.add("Банк");
        words.add("Финансы");
        words.add("Алгоритм");
        words.add("Музыка");
        words.add("Джобс");
        words.add("Музыка");
        words.add("Правда");
        words.add("Сила");
        words.add("Банк");
        words.add("Виски");
        words.add("Правда");
        words.add("Религия");
        words.add("Управление");
        words.add("Банк");
        words.add("Алгоритм");

        Map<String, Integer> map = getMap(words);
        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();

        while (iter.hasNext()){

            System.out.println(iter.next());
        }

    }

    private static Map<String, Integer> getMap(List<String> words) {
        Map<String, Integer> workMap = new HashMap<>();
        for (String s : words) {
            if (!workMap.containsKey(s)) {
                workMap.put(s, 1);
            } else {
                workMap.put(s, workMap.get(s) + 1);
            }
        }
        return workMap;
    }
}
