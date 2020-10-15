package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.2.4
Составьте программу к задаче
«Вводить числа с клавиатуры, пока они образуют убывающую последовательность. Сколько чисел было введено по убыванию?».
 */
public class Task_33
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int c = 0;
        int p = sc.nextInt();
        while (p > i)
        {
            i = p;
            p = sc.nextInt();
            c++;
        }
        System.out.println(c);
    }
}
