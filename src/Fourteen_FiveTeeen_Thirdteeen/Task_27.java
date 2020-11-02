package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.1.5
Составьте программу к задаче «Вводить числа с клавиатуры, пока они положительны».
 */
public class Task_27
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i >= 0)
        {
            System.out.println("Введите следующее число");
            i = sc.nextInt();
        }
        System.out.println(i + " - отрицательно. Программа выполнена");
    }
}
