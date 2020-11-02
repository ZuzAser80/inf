package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.3
Составить программу, которая среди n введенных чисел находит произведение нечетных.
 */
public class Task_13
{
    public static void main(String[] args)
    {
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stg = 1;
        for (int i = 0;i < n;i++)
        {
            System.out.println("Введите следующее число");
            int d = sc.nextInt();
            if (d % 2 != 0)
            {
                stg = stg * d;
            }
        }
        System.out.println("n введенных чисел произведение нечетных = " + stg);
    }
}
