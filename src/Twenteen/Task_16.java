package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.6
Составить программу, которая запрашивает
количество учеников в классе, затем просит ввести рост каждого учащегося
и находит средний рост.
 */
public class Task_16
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double stg = 1;
        for (int i = 0;i < n;i++)
        {
            System.out.println("Введите следующее число");
            int d = sc.nextInt();
            stg += d;
        }
        System.out.println("Среднее арифм = " + stg / n);
    }
}
