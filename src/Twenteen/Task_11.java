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
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i < 10;i++)
        {
            System.out.println("Введите число");
            int g = sc.nextInt();
        }
    }
}
