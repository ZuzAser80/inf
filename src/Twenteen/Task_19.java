package Twenteen;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.4.1
Составьте программу к задаче: «Соблюдая диету, человек в первый день сбросил 1 кг.
Каждый последующий день он скидывал на 200 г больше, чем в предыдущий.
Сколько человек потеряет в весе за неделю?».
 */
public class Task_19
{
    public static void main(String[] args)
    {
        double kilo = 1;
        double strg = 1;
        for (int i = 0;i < 6;i++)
        {
            kilo += 0.2;
            strg += kilo;
            System.out.println("День " + (i + 1) + ", скинул " + kilo + ", " + strg);
        }
        System.out.println("Скинул = " + strg);
    }
}
