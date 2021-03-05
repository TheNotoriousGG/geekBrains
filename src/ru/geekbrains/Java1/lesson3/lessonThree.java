package ru.geekbrains.Java1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class lessonThree
{
    public static void main(String[] args)
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                          "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                          "olive","pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        guessTheWord(words);

    }

    public static void guessTheWord(String[] words)
    {
        System.out.println("Компьютер загадает слово из массива. Цель вашей игры - угадать его)");
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int rndNum = rnd.nextInt(words.length - 1);
        int shortLength;

        String hiddenWord = words[rndNum];
        do
            {
            String resString = "";

            System.out.println("Введите предполагаемое слово:");
            String myWord = scan.nextLine().toLowerCase();
            if (myWord.length() <= hiddenWord.length())
            {
                shortLength = myWord.length();
            }
            else
            {
                shortLength = hiddenWord.length();
            }

            if (hiddenWord.equals(myWord))
            {
                System.out.println("Поздравляю!!!!!!!Вы угадали слово " + myWord);
                return;
            }
            else
            {
                for (int i = 0; i < shortLength; i++)
                {
                    if (hiddenWord.charAt(i) == myWord.charAt(i))
                    {
                        resString += hiddenWord.charAt(i);
                    }
                    else
                    {
                        resString += '#';
                    }
                }

                resString += "#############";
            }
            System.out.println("Вы не угадали((... Все совпадения букв указаны ниже. (# - засекреченный символ)");
            System.out.println(resString);
        }
        while(true);
    }

}
