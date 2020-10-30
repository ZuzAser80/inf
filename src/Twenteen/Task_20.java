package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.4.2
 */
//TODO: Добавить описание задачи
public class Task_20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double a = sc.nextInt();
        double k = sc.nextInt();
        for (int i = 0;i < k;i++)
        {
            double proc = x / 100;
            double pr = proc * a;
            x += pr;
        }
        System.out.print(x);
    }
}
