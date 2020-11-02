package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.4.3
Составьте программу к задаче:
«На весах стояло n гирь. Первая весила m г.
Каждая следующая гиря на 15% тяжелее предыдущей.
Найти общий вес гирь, средний вес гирь и самую тяжелую гирю».
 */

public class Task_21
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        int g = 0;
        int n = sc.nextInt();
        for (int i = 0;i < n;i++)
        {
            m = m * 1.15;
            g += m;
        }
        //TODO: добавить вывод комментария, что нашли, сейчас выводиться только общий вес, нету среднего веса и тяжелой гири
        System.out.print(g);
    }
}
