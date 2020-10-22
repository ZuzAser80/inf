package Fourteen_FiveTeeen_Thirdteeen;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.15.5
Составить программы нахождения суммы всех двузначных чисел, у которых цифры расположены по возрастанию
с использованием всех видов циклов.
 */
public class Task_38
{

    public static void main(String[] args)
    {
        int f = 0;
        for (int i = 10;i <= 99;i++)
        {
            int g = i;
            while (g % 10 != 0)
            {
                int h = g % 10;
                if (h - 1 == f)
                {
                    System.out.println(i);
                }
                g = g /10;
                f = h;
            }
            f = 0;
        }
    }
}
