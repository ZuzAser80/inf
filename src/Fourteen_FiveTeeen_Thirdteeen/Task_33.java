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
        //TODO: добавить promt, иначе создается впечатление что программа зависла
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int p = 0;
        int c = 0;
        while (p < i)
        {
            p = i;
            //TODO: добавить приглашение ввести следующее число
            i = sc.nextInt();
            c++;
        }
        //TODO: добавить комментарий, что нашли
        System.out.println(c);
    }
}
