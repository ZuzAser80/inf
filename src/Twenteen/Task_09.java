package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.2.6
Составить программу,
распечатывающую таблицу умножения на заданное число а
 */
public class Task_09
{
    public static void main(String[] args)
    {
        System.out.println("Введите число a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1;i <= 10;i++)
        {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}
