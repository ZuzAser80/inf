package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.1.7
Составьте программу к задаче «Вводить числа с клавиатуры, пока не встретится задуманное число x».
Усовершенствуйте предыдущую, чтобы после ввода числа выводилось одно из сообщений «МНОГО» или «МАЛО».
 */
public class Task_29
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = sc.nextInt();
        while (i != x)
        {
            if (i > x)
            {
                System.out.print("МНОГО");
            }
            if (i < x)
            {
                System.out.println("МАЛО");
            }
            System.out.println("Введите число");
            i = sc.nextInt();
        }
        System.out.println(i + " = " + x + " Вывод закончен");
    }
}
