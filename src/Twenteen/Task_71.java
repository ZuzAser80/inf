package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 04.11.2020.
 */
/*
2.12.4.5
Составить программу поиска трехзначного числа,
которое кратно заданному числу m и, в котором цифры расположены по возрастанию.
Если такого числа не существует, сообщите об этом.
 */
public class Task_71
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите m");
        int m = sc.nextInt();
        int d = 0;
        for (int i = 100;i <= 999;i++)
        {
            if (i % m == 0)
            {
                d++;
                int g = i;
                int a = g % 10;
                g = g / 10;
                int b = g % 10;
                g = g / 10;
                int c = g % 10;
                if (a > b && b > c)
                {
                    System.out.println("Число существует, и оно = " + i);
                }
            }
        }
        if (d == 0)
        {
            System.out.println("Число несуществует");
        }
    }
}
