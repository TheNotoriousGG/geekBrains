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

        
        double result = calculate(2, 4,1,2);
        System.out.println(result);



    }

    static double calculate(double a,double b,double c,double d)
    {
        return a * (b + (c / d));
    }


}
