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
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int p = 0;
        int c = 0;
        while (p < i)
        {
            p = i;
            System.out.println("Введите число");
            i = sc.nextInt();
            c++;
        }
        System.out.println(c + " чисел было введено по убыванию.");
    }
}
