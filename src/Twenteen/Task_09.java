package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.2.6
 */
public class Task_09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1;i <= 10;i++)
        {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}
