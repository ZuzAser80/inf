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

        //TODO: добавить promt, иначе создается впечатление что программа зависла
        int max = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i < n;i++)
        {
            //TODO: добавить promt с просьбой ввести следующее число
            int d = sc.nextInt();
            max = d;
            if (d >= max)
            {
                max = d;
            }
            //TODO: добавить вывод комментария, что нашли
            System.out.print(max);
        }
    }
}
