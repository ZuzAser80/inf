package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.5.1
 */
//TODO: Добавить описание задачи
public class Task_25
{
    public static void main(String[] args)
    {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i < n;i++)
        {
            int d = sc.nextInt();
            max = d;
            if (d >= max)
            {
                max = d;
            }
            System.out.print(max);


        }
    }
}
