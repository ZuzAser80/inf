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
        //TODO: добавить promt, иначе создается впечатление что программа зависла
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i >= 0)
        {
            //TODO: добавить приглашение ввести следующее число
            i = sc.nextInt();
        }
        //TODO: добавить промт с сообщением что ввод закончен
    }
}
