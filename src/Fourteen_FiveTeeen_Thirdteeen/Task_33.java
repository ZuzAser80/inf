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
        int p = sc.nextInt();
        int i = p - 1;
        while(K(p, i))
        {
            int c = 0;
            p = sc.nextInt();
            System.out.println(c);
        }
    }
    static boolean K(int g1,int g2)
    {
        if (g2 - g1 == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
