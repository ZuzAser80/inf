package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.1.8
Составить программу, находящую сумму четных чисел из промежутка от 1 до n.
 */
public class Task_04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str = 0;
        for (int i = 0;i <= n;i += 2)
        {
            str++;

        }
        System.out.println(str);
    }
}
