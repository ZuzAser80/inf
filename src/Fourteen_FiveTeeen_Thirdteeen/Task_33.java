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

        int c = 0;
        int p = sc.nextInt();
        int i = p - 1;
        while (p - i == 1)
        {
            i++;
            p = sc.nextInt();
            c++;
        }
        System.out.println(c);
    }
}
