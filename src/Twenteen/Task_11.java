package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.1
Составить программу, которая запрашивает ввод десяти чисел.
 */
public class Task_11
{
    public static void main(String[] args)
    {
        System.out.println("Введите десять чисел");
        Scanner sc = new Scanner(System.in);

        for (int i = 1;i <= 10;i++)
        {
            System.out.println("Введите число номер " + i);
            sc.nextInt();
        }
        System.out.println("Вы ввели 10 чисел");
    }
}
