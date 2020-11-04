package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 04.11.2020.
 */
/*
2.12.4.6
Составьте программу к задаче:
«Мама дает ученику на карманные расходы а руб. в день. Ученик тратит b руб.
Каждый день расходы его увеличиваются на 3% от расходов предыдущего дня.
Сколько денег ему выпросить у папы, чтобы прожить 10 дней.
Если денег просить не придется, то сообщите об этом».
 */
public class Task_73
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        double a = sc.nextInt();
        System.out.println("Введите б");
        double b = sc.nextInt();
        double stg = 0;
        for(int i = 0;i <= 10;i++)
        {
            double balanse = a;
            double g = balanse -= b;
            if (g <= 0)
            {
                System.out.println("На дне " + i + " придется выпросить " + Math.abs(g));
                stg += Math.abs(g);
            }
            balanse -= b;
            b = b * 1.3;
        }
        System.out.println("Надо выпросить в общем: " + stg);
    }
}
