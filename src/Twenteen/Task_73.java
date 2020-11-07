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
        double balanse = a;
        for(int i = 1;i <= 10;i++)
        {
            balanse = balanse - b;
            double g = balanse;
            System.out.println("На дне " + i + " Баланс " + balanse + ", расход: " + b);
            if (g <= 0)
            {
                System.out.println("На дне " + i + " придется выпросить " + Math.abs(g));
                stg += Math.abs(g);
            }
            b = b * 1.03;
        }
        System.out.println("Надо выпросить в общем: " + stg);
    }
}
