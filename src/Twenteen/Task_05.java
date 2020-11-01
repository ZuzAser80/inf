package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.1.9
Вывести на экран все числа из промежутка от 1 до n, которые делятся на 2, 3 и 5.
 */
public class Task_05
{
    public static void main(String[] args)
    {
        //TODO: добавить promt, иначе создается впечатление что программа зависла
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
