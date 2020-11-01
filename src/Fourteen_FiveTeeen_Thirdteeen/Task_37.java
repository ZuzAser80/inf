package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.15.4
Составить программы вывода на экран всех чисел из промежутка от 1 до n,
которые делятся на 4 и 5 с использованием всех видов циклов.
 */
public class Task_37
{
    public static void main(String[] args)
    {
        //TODO: добавить promt, иначе создается впечатление что программа зависла
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int h = 1;h <= n;h++)
        {
            if (h % 4 == 0 || h % 5 == 0)
            {
                System.out.println(h);
            }
        }

    }
}
