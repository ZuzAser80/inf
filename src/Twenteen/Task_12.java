package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.2
Составить программу, которая запрашивает ввод десяти чисел и находит их сумму
 */
public class Task_12
{
    public static void main(String[] args)
    {
        System.out.println("Введите 10 чисел");
        Scanner sc = new Scanner(System.in);
        int g = 0;
        for (int i = 1;i <= 10;i++)
        {
            System.out.println("Введите число номер " + i);
            int h = sc.nextInt();
            g += h;
        }
        System.out.print("Сумма = " + g);
    }
}
