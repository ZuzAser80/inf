package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.5.1
Составить программу, которая запрашивает ввести n чисел и находит среди них максимальное число.
 */
public class Task_25
{
    public static void main(String[] args)
    {

        System.out.println("Введите число n");
        int max = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i < n;i++)
        {
            System.out.println("Введите следующее число");
            int d = sc.nextInt();
            max = d;
            if (d >= max)
            {
                max = d;
            }
            System.out.print("максимальное число = " + max);
        }
    }
}
