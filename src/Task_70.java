/**
 * Created by Danil on 19.10.2020.
 */
/*
Составить программу к задаче:
«Долгожитель обнаружил, что если к сумме квадратов цифр его возраста
прибавить число дня его рождения,
то получится его возраст. Сколько ему лет?».

 */
public class Task_70
{
    public static void main(String[] args)
    {
        for (int i = 100;i <= 200;i++)
        {
            int n1 = i / 100;
            int n2 = i / 10 - n1 * 10;
            int n3 = i % 10;
            int n = n1 * n1 + n2 * n2 + n3 * n3;
            if (n >= i)
            {
                continue;
            }
            if (i - n <= 31)
            {
                System.out.println(i);
            }
        }
    }
}
