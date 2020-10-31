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
        Scanner sc = new Scanner(System.in);
        int g = 0;
        for (int i = 0;i < 10;i++)
        {
            int h = sc.nextInt();
            g += h;
        }
        System.out.print(g);
    }
}
