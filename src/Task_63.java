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
            for (int g = 1;g <= i;g++)
            {
                if (i % g == 0)
                {
                    c++;
                    if (c == 10) //TODO: помоему эта задача уже была, сейчас она выводить в том числе числа у котоных 11, 12 и так далее делителей
                    {
                        System.out.println(i);
                    }
                }
            }
            c = 0;
        }

    }
}
