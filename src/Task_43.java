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
        System.out.println("Введите число n");
        int n = sc.nextInt();
        double d = 0;
        int i = 0;
        do
        {
            i++;
            int g = n % 10;
            n = n / 10;
            d += g;

        }
        while (n > 0);
        d = d / i;
        System.out.println(d);
    }
}
