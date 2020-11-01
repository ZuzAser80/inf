package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.1.5
Составить программу, печатающую на экране числа от 1 до n.
 */
public class Task_01
{
    public static void main(String[] args)
    {
        //TODO: добавить promt, иначе создается впечатление что программа зависла, примерно так:
        //System.out.print("Ввыдите число n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i < n;i++) //TODO: наверное число n тоже должно выводиться
        {
            System.out.println(i);
        }
    }
}
