package Twenteen;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.2.4
Составить программу, распечатывающую все трехзначные числа, у которых цифры расположены в порядке возрастания
 */
public class Task_07
{
    public static void main(String[] args)
    {
        for (int i = 100;i <= 999;i++)
        {
            int g = i;
            int a = g % 10;
            g = g / 10;
            int b = g % 10;
            g = g / 10;
            int c = g % 10;
            g = g / 10;
            if (a > b && b > c)
            {
                System.out.println(i);
            }
        }

    }
}
