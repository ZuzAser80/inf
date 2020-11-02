package Twenteen;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.2.7
Составить программу,
выводящую на экран таблицу значений функции  y=ax+b, при заданных a и b для х,
принимающего значения от -10 до 10.
 */
public class Task_10
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int x = -10;x <= 10;x++)
        {
            int g = a * x;
            int sum = g + b;
            System.out.println("При х = " + x + " y = " + sum);
        }
    }
}
