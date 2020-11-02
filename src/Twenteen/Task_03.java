package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*

2.12.1.7
Фаториалы
Составить программу вычисления факториала числа n.
Факториалом числа n (n!) называют произведение целых чисел от 1 до n
(1*2*3*..*n).
 */
public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 1;
        for (int i = 1;i <= n;i++)
        {
            g = g * i;
        }
        System.out.println("Факториал: " + g);
    }
}
