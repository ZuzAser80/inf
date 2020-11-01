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
        //TODO: добавить promt, иначе создается впечатление что программа зависла
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int c = 0;
        while (i % 5 != 0)
        {
            //TODO: добавить приглашение ввести следующее число
            i = sc.nextInt();
            String g = Integer.toString(i); //TODO: что делает эта строка? Переменная g дальше не используется
            if (i % 10 == 2)
            {
                c++;
            }
        }
        System.out.println("Количество цифр, оканчивающихся на 2: " + c);
    }
}
