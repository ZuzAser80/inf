/**
 * Created by Danil on 18.10.2020.
 */
/*
2.13.2.1
Составить программу к задаче:
«Известно, что число 1?2??
(знаки вопроса свидетельствуют о пропущенных цифрах) делится нацело на 37.
 */
public class Task_62
{
    public static void main(String[] args)
    {
        for (int i = 10200;i < 19299;i += 1011)
        {
            if (i % 37 == 0)
            {
                System.out.println("1?2?? = " + i);
            }
        }
    }
}