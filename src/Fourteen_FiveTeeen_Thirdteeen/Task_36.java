package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.15.3
Составить программу, которая среди n введенных чисел
считает количество чисел равных 0 или кратных 10 с
использованием всех видов циклов.
*/
//TODO: нужно добавить реалзацию с циклами while и do ... while
public class Task_36
{
    public static void main(String[] args)
    {
        System.out.println("Введите число n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int h = 0;h < n;h++)
        {
            System.out.println("Введите число");
            int i = sc.nextInt();
            if (i == 0 || i % 10 == 0)
            {
                c++;
            }
        }
        System.out.println(c + " чисел равно 0 или кратно 10");
    }
}
