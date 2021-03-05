package ru.geekbrains.Java3.Lesson1.Task1_Tast2;

import java.util.Arrays;

public class SwapArrElementMain {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 4, 5, 6};
        String[] arr1 = new String[]{"Шла","Маша","По","Шоссе"};

        System.out.println(Arrays.toString(swap(arr, 1, 2)));
        System.out.println(Arrays.toString(swap(arr1, 1, 22)));


    }

    private static Object[] swap(Object[] arr, int i1, int i2) {
        if(arr.length >= i1 && arr.length >= i2){
            Object prom = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = prom;
            return arr;
        }else
        {
            System.out.println("Введен не корректный индекс массива");
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}