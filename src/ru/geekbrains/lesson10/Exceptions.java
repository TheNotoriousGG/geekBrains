package ru.geekbrains.lesson10;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int res = foo(new String[][]{
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"}
            });
            System.out.println(res);

        } catch (MyArraySizeException e) {
            e.printStackTrace();

        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int foo(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        boolean isActual = true;
        int normSize = 4;
        int value;
        int result = 0;

        if (arr.length != normSize) {
            isActual = false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != normSize) {
                isActual = false;
            }
        }

        if (isActual == false) {
            throw new MyArraySizeException("Указан неверный размер массива ожидается String[4][4]");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    value = Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Невозможно преобразовать в int: arr[" + i + "][" + j + "]={" + arr[i][j] + "}");
                }

                result = result + value;
            }
        }
        return result;

    }
}
