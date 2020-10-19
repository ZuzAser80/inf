/**
 * Created by Danil on 18.10.2020.
 */
/*
2.13.2.2
Составить программу печати трехзначных чисел, имеющих 10 делителей
Я НЕ ВЕРБЛЮД
*/
public class Task_63
{
    public static void main(String[] args)
    {
        int c = 0;
        for (int i = 100;i <= 999;i++)
        {
            for (int g = 1;g <= 9;g++)
            {
                if (i % g == 0)
                {
                    c++;
                    if (c == 10)
                    {
                        System.out.println(i);
                    }
                }
            }
            c = 0;
        }

    }
}
