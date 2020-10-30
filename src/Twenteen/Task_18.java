package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.8
 */
//TODO: Добавить описание задачи
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


