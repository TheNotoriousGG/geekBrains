package ru.geekbrains.lesson12;

import ru.geekbrains.lesson12.Interfaces.*;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class mainClass {
    public static void main(String[] args) throws InterruptedException {
//Первое вхождение
        Integer[] numbers = new Integer[]{4, 8, 15, 16, 23, 42};

        Searchable s = (num, arr) -> {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return i;
                }
            }
            return -1;
        };

        System.out.println("Первое вхождение в позиции: " + s.search(42, numbers));

//Здесь мы перевернем строку

        Reverse r = (str) -> new StringBuilder(str).reverse().toString();

        System.out.println("Перевернем: " + r.reverse("Дым табачный воздух выел."));

//Здесь найдем максЧисло

        MaxiNum mxn = (list) -> {
            Integer maybeMax = 0;
            for (int i = 0; i < list.length; i++) {
                if (numbers[i] > maybeMax) {
                    maybeMax = numbers[i];
                }
            }
            return maybeMax;
        };

        System.out.println("Максимальное число: " + mxn.maximum(numbers));


//Среднее арифметическое
        List<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(3);
        nums.add(7);
        nums.add(9);
        nums.add(9);
        nums.add(9);
        nums.add(2);


        Average avr = (list) -> {
            double sum = 0;
            double lngth = list.toArray().length;
            for (int i : list) {
                sum += i;
            }
            double result = sum/lngth;
            return result;
        };

        System.out.println("Среднее арифметическое из чисел из массива: " + avr.average(nums));

//Здесь стринги
        List<String> stringList = new ArrayList<>();
        stringList.add("Лалала");
        stringList.add("ара");
        stringList.add("Антон");
        stringList.add("абв");
        stringList.add("Привет");
        stringList.add("Мир");
        stringList.add("Ленин");
        stringList.add("артефакт");

        Strings str = (list) -> {
            List<String> result = new ArrayList<>();
            for (String string: list) {
                if (string.length() == 3 && string.toCharArray()[0] == 'а')
                    result.add(string);
            }
            return result;
        };

        System.out.print(str.search(stringList)+ " ");
    }

}
