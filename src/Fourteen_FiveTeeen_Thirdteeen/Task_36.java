package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.15.3
Составить программу, которая среди n введенных чисел
считает количество чисел равных 0 или кратных 10 с
использованием всех видов циклов.
*/
public class Task_36
{
    public static void main(String[] args)
    {
        loopFor();
    }

    static void loopFor() {
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int h = 0;h < n;h++)
        {
            System.out.println("Введите число");
            int i = sc.nextInt();
            if (i == 0 || i % 10 == 0)
            {
                c++;
            }
        }
        System.out.println(c + " чисел равно 0 или кратно 10");
    }

    static void loopWhile() { //TODO: запустить проверить
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int h = 0;
        while (h < n) //TODO: сейчас в цикле выполнятся только команда h++
        h++;
        {
            System.out.println("Введите число");
            int i = sc.nextInt();
            if (i == 0 || i % 10 == 0)
            {
                c++;
            }
        }
        System.out.println(c + " чисел равно 0 или кратно 10");
    }

    static void Loop3()  //TODO: поправить цикл do while
    {
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int h = 0;
        h++; //TODO: тут цикла нет совсем
        {
            System.out.println("Введите число");
            int i = sc.nextInt();
            if (i == 0 || i % 10 == 0)
            {
                c++;
            }
        }
        System.out.println(c + " чисел равно 0 или кратно 10");
    }

}
