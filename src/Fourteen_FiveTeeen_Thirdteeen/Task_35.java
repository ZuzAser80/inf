package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.2.6
Составьте программу к задаче
«Вводить числа, пока их сумма не превысит 100. Среди них найти максимальное число».
 */
public class Task_35
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int s = 0;
        while (c <= 100)
        {
            System.out.println("Введите следующее число");
            int i = sc.nextInt();
            c += i;
            if (i > s)
            {
                s = i;
            }
        }
        System.out.println("Макс. число = " + s);
    }
}
