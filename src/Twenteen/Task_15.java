package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.5
Составить программу, которая запрашивает ввести n чисел и находит произведение тех из них, которые оканчиваются на 3.
 */
public class Task_15
{
    public static void main(String[] args)
    {
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stg = 1; //TODO: добавить флаг проверки ввода чисел, заканчивающихся на 3
        for (int i = 0;i < n;i++)
        {
            System.out.println("Введите следующее число");
            int d = sc.nextInt();
            if (d % 10 == 3)
            {
                stg = stg * d;
            }
        }
        System.out.println("Итог = " + stg);
    }
}
