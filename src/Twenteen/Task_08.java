package Twenteen;

/**
 * Created by Danil on.10.2020.
 */
/*
2.12.2.5
 */
public class Task_08
{
    public static void main(String[] args)
    {
        for (int i = 1000;i <= 9999;i++)
        {
            int g = i;
            int a = g % 10;
            g = g / 10;
            int b = g % 10;
            g = g / 10;
            int c = g % 10;
            g = g / 10;
            int d = g % 10;
            if (a == d && b == c && d != c)
            {
                System.out.println(i);
            }
        }

    }
}
