package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 04.11.2020.
 */
/*-
2.12.4.4
Составьте программу к задаче: «На яблоне было х яблок. В первый день с яблони упало а яблок.
Каждый следующий день опадало в 2 раза больше яблок, чем в предыдущий.
Сколько яблок останется через k дней?».
 */
public class Task_72
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите х");
        int x = sc.nextInt();
        System.out.println("Введите к");
        int k = sc.nextInt();
        System.out.println("Введите а");
        int a = sc.nextInt();
        int srg = 0;
        for (int i = 1;i <= k;i++)
        {
            srg += a;
            a = a * 2;
        }
        int d = x - srg;
        System.out.println("Останется " + d);
    }
}
