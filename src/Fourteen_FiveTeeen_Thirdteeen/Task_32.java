package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.1.9
Составьте программу к задаче
«Вводить числа с клавиатуры, пока не встретится число кратное 5. Сколько среди введенных чисел оканчивалось цифрой 2?».
 */
public class Task_32
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int c = 0;
        while (i % 5 != 0)
        {
            System.out.println("Введите число");
            i = sc.nextInt();
            if (i % 10 == 2)
            {
                c++;
            }
        }
        System.out.println("Количество цифр, оканчивающихся на 2: " + c);
    }
}
