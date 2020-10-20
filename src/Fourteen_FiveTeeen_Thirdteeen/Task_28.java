package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.1.6
Составьте программу к задаче «Вводить числа с клавиатуры, пока не встретится задуманное число x».
 */
public class Task_28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = sc.nextInt();
        while (i != x)
        {
            i = sc.nextInt();
        }
    }
}
