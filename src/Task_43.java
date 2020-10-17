import java.util.Scanner;

/**
 * Created by Danil on 16.10.2020.
 */
/*
2.16.1.4
Составить программу к задаче
«Дано число n. Найти среднее арифметическое его цифр».
 */
public class Task_43
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        int i;
        String h = Integer.toString(n);
        for (i = 0;i < h.length();i++) //TODO: нужно переделать на цикл деления пока n > 10
        {
            int g = n % 10;
            n = n / 10;
            d += g;
        }
        d = d / i;
        System.out.println(d);
    }
}
