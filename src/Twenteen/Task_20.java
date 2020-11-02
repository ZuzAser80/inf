package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.4.2
Составьте программу к задаче: «Первоначальная выручка предприятия за месяц работы равна х руб.
Каждый месяц выручка возрастает на а% от выручки предыдущего месяца.
Какова будет месячная выручка через k месяцев?».
 */
public class Task_20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первоначальную выручку предприятия за месяц работы");
        double x = sc.nextInt();
        System.out.println("Введите первоначальную процент увеличения выручки");
        double a = sc.nextInt();
        System.out.println("Введите количество месяцев");
        double k = sc.nextInt();
        for (int i = 0;i < k;i++)
        {
            double proc = x / 100;
            double pr = proc * a;
            x += pr;
        }

        System.out.print("месячная выручка через k месяцев = " + x);
    }
}
