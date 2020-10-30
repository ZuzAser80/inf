package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*

2.12.1.7
Фаториалы
 */
//TODO: описание задачи
public class Task_03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 1;
        for (int i = 1;i <= n;i++)
        {
            g = g * i;
        }
        System.out.println(g);
    }
}
