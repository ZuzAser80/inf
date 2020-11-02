package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.1.10
Составить программу, находящую сумму всех двузначных чисел.
 */
public class Task_06
{
    public static void main(String[] args)
    {
        int o = 0;
        for (int i = 10;i <= 99;i++)
        {
            o += i;
        }
        System.out.println("Сумма = " + o);
    }
}
