package Fourteen_FiveTeeen_Thirdteeen;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.15.6
Составить программу, которая находит наименьшее трехзначное число, имеющее 10 делителей.
 */
public class Task_39
{
    public static void main(String[] args)
    {
        for (int n = 100;n <= 999;n++)
        {
            int s = 0;
            for (int i = 2;i <= n;i++)
            {
                if (n % i == 0)
                {
                    s++;
                }
            }
            if (s >= 10)
            {
                System.out.println("Tрехзначное число, имеющее 10 делителей = " + n);
                break;
            }
        }

    }
}
