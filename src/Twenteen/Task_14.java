package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.4
Составить программу, которая среди n введенных чисел считает количество чисел равных 0.
 */
public class Task_14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stg = 0;
        for (int i = 0;i < n;i++)
        {
            int d = sc.nextInt();
            if (d == 0)
            {
                stg++;
            }
        }
        System.out.println(stg);

    }
}
