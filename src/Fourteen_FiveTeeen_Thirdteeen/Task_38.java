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
        Loop1();
    }
    static void Loop1()
    {
        for (int i = 10;i <= 99;i++)
        {
            int g = i;
            int a = g % 10;
            g = g / 10;
            int b = g % 10;
            if (a > b)
            {
                System.out.println(i);
            }
        }
    }
    static void Loop2()
    {
        int i = 100;
        while (i >= 0)
        {
            int g = i;
            int a = g % 10;
            g = g / 10;
            int b = g % 10;
            if (a > b)
            {
                System.out.println(i);
            }
            i--;
        }
    }
    static void Loop3()
    {
        int i = 100;
        do
        {
            int g = i;
            int a = g % 10;
            g = g / 10;
            int b = g % 10;
            if (a > b)
            {
                System.out.println(i);
            }
            i--;

        } while (i >= 0);
    }
}
