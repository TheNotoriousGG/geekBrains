package ru.geekbrains.Java1.lesson2;

public class lessonTwo {
    public static void main(String[] args) {
        //task1
        changeArrVls(new int[]{1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0});
        //task2
        insToArr(new int[8]);
        //task3
        fromRagsToRiches(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        //task4
        diagonalWalk(new int[5][5]);
        //task5
        minMaxValue(new int[]{9, 3, 7, 9, 9, 9, 2});
        //task6
        System.out.println(checkMiddle(new int[]{5, 10, 5, 30, 10, 3, 7, 70}));
        System.out.println("_______________");
        //task7
        int[] movedArr = new int[]{1,2,3,4,5};

        for(int i = 0; i < movedArr.length; i++)
        {
            System.out.print(" " + movedArr[i]);
        }

        System.out.println("");

        int[] resArr = moveArrPosition(movedArr,9999999);

        for(int i = 0; i < resArr.length; i++)
        {
            System.out.print(" " + resArr[i]);
        }

    }


    public static void changeArrVls(int[] Arr)
    {
        for (int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + " - ");
            switch (Arr[i]) {
                case 0:
                    Arr[i] = 1;
                    break;
                case 1:
                    Arr[i] = 0;
                    break;
                default:
                    System.out.println("Массив пуст или содержит числа отличные от 0 и 1");
            }

            System.out.println(Arr[i]);
        }

        System.out.println("_______________");
    }

    public static void insToArr(int[] Arr8)
    {
        for (int i = 0; i < Arr8.length; i++)
        {
            System.out.print(Arr8[i] + " - ");
            Arr8[i] = i * 3;
            System.out.println(Arr8[i]);
        }

        System.out.println("_______________");
    }

    public static void fromRagsToRiches(int[] Arrkham)
    {
        for (int i = 0; i < Arrkham.length; i++)
        {
            System.out.print(Arrkham[i] + " - ");

            if (Arrkham[i] < 6)
            {
                Arrkham[i] *= 2;
            }
            System.out.println(Arrkham[i]);
        }
        System.out.println("_______________");
    }

    public static void diagonalWalk(int[][] Arr)
    {
        for (int i = 0; i < Arr.length; i++)
        {
            System.out.println(" ");
            for (int j = 0; j < Arr[i].length; j++)
            {
                int counter = (Arr[i].length - 1) - i;

                if (i == j)
                {
                    Arr[i][j] = 1;
                } else if (j == counter)
                {
                    Arr[i][j] = 1;
                }
                System.out.print(" " + Arr[i][j]);
            }
        }
        System.out.println(" ");
        System.out.println("_______________");
    }

    public static void minMaxValue(int[] Arr)
    {
        int minValue = Arr[1];
        int maxValue = Arr[1];

        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] <= minValue)
            {
                minValue = Arr[i];
            }
            else if (Arr[i] >= maxValue)
            {
                maxValue = Arr[i];
            }
        }
        System.out.println("Минимальное значение: " + minValue + " Максимальное значение: " + maxValue);
        System.out.println("_______________");
    }

    public static boolean checkMiddle(int[] ints)
    {
        int leftSum = 0;

        for (int i = 0; i < ints.length; i++)
        {
            int rightSum = 0;
            leftSum += ints[i];

            for (int j = i + 1; j < ints.length; j++)
            {
                rightSum += ints[j];
            }

            if (leftSum == rightSum)
            {
                String position = "";
                for (int k = 0; k < ints.length; k++)
                {
                    if (k == i)
                    {
                        position = position + " " + ints[k];
                        position += " ||";
                    }
                    else
                        {
                        position = position + " " + ints[k];
                    }

                }
                System.out.println("{" + position + " }");
                return true;
            }
        }
        return false;
    }

    public static int[] moveArrPosition(int[] arr, int n) //5 4 3 5 2
    {
        if (n > 0)
        {
            n %= arr.length;

            for (int i = 0; i < n; i++)
            {
                int last = arr[arr.length-1];
                for (int j = arr.length-1; j > 0; j--)
                {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            }
        }
        else if (n < 0)
        {
            n %= arr.length * -1;

            for(int i = 0; i > n; i--)
            {
                int firstValue = arr[0];
                for (int j = 0; j < arr.length - 1; j++)
                {
                  arr[j] = arr[j+1];

                }
                arr[arr.length - 1] = firstValue;
            }
        }
        return arr;
    }
}
