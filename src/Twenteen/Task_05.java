package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.1.9
 */
//TODO : Некоторые ыводятся 2 раза.break - не вариант
public class Task_05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n;i++)
        {
            if (i % 5 == 0)
            {
                System.out.println(i);

            }
            else if (i % 3 == 0)
                {
                    System.out.println(i);
                }
                else if (i % 2 == 0)
                    {
                        System.out.println(i);
                    }
        }
    }
}
