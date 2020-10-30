package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
//TODO: Добавить описание задачи
public class Task_21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        int g = 0;
        int n = sc.nextInt();
        for (int i = 0;i < n;i++)
        {

            m = m * 1.15;
            g += m;
        }
        System.out.print(g);
    }
}
