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
        //TODO: добавить promt, иначе создается впечатление что программа зависла
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stg = 1;
        for (int i = 0;i < n;i++)
        {
            //TODO: добавить promt, иначе создается впечатление что программа зависла, что-то вроде System.out.print("Введите следующее число")
            int d = sc.nextInt();
            if (d % 10 == 3)
            {
                stg = stg * d;
            }
        }
        //TODO: добавить вывод комментария, что нашли
        System.out.println(stg);
    }
}
