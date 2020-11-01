package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.1.6
Составить программу, печатающую нечетные числа из промежутка от 1 до n.
 */

public class Task_02
{
    public static void main(String[] args)
    {
        //TODO: добавить promt, иначе создается впечатление что программа зависла
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i < n;i += 2)
        {
            System.out.println(i);
        }
    }
}
