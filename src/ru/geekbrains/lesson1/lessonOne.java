package ru.geekbrains.lesson1;

public class lessonOne
{
    public static void main(String[] args)
    {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;

        double d = 1.5;
        float f = 1.6f;

        char c = 'c';

        boolean bool = false;

        //task3
        double result = calculate(2, 4,1,2);
        System.out.println(result);

        //task4
        boolean comp = comparison(3,15);
        System.out.println(comp);

        //task5
        positOrNeg(-666);

        //task6
        boolean resultPos = giveMePositive(-5);
        System.out.println(resultPos);

        //task7
        printHiName("Георгий");




    }

    static double calculate(double a,double b,double c,double d)
    {
        return a * (b + (c / d));
    }

    static boolean comparison(int leftOper,int rightOper)
    {
        int sum = leftOper + rightOper;

        if(sum > 10 && sum <= 20)
            {
               return  true;
            }
        else
            {
                return false;
            }
    }

    static void positOrNeg(int i)
    {
        if (i < 0)
            {
                System.out.println(i + "  - Отрицательное число");
            }
        else
        {
            System.out.println(i + "  - Положительное число");
        }

    }

    static boolean giveMePositive(int i)
    {
        boolean result = false;
        if(i<0)
            {
                result = true;
            }
        return result;
    }

    static void printHiName(String name)
        {
            System.out.println("Привет,"+name+"!");
        }
}
