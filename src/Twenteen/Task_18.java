package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.8
Составить программу, которая при заданном целом положительном числе а,
находит 10(степень)
(не вводите большой показатель степени, помните о типах данных).
 */
public class Task_18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 1;
        for (int i = 0;i < a;i++)
        {
            result = result * 10;
        }
        System.out.println(result);
    }
}


