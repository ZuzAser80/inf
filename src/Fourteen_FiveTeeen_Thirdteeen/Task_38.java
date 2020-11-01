package Fourteen_FiveTeeen_Thirdteeen;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.15.5
Составить программы нахождения суммы всех двузначных чисел, у которых цифры расположены по возрастанию
с использованием всех видов циклов.
 */
//TODO: нужно реализовать циклами while и do ... while
public class Task_38
{

    public static void main(String[] args)
    {
        for (int i = 10;i <= 99;i++)
        {
            int g = i;
            int a = g % 10;
            g = g / 10;
            int b = g % 10;
            g = g / 10; //TODO: лишнее вычисление
            if (a > b)
            {
                System.out.println(i);
            }
        }
    }
}
