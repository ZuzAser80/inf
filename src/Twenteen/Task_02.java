package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.1.6
 */
//TODO: написать задачу
public class Task_02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i < n;i += 2)
        {
            System.out.println(i);
        }
    }
}
