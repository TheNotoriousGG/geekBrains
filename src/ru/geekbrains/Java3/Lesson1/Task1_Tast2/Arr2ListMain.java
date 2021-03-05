package ru.geekbrains.Java3.Lesson1.Task1_Tast2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr2ListMain {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,5,8,7};
        List<Integer> list = new ArrayList<Integer>(convert(arr));
    }

    private static <T> ArrayList<T> convert(T[] arr) {
        ArrayList<T> list = new ArrayList<T>(Arrays.asList(arr));
        return list;
    }


}
