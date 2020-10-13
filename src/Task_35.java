import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.2.6
Составьте программу к задаче
«Вводить числа, пока их сумма не превысит 100. Среди них найти максимальное число».
TODO: MAX
 */
public class Task_35
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int c = 0;
        int s = 0;
        while (c <= 100)
        {
            c += i;
            i = sc.nextInt();
            if (i > c)
            {
                s = i;
            }

        }

        System.out.println(s);
    }
}
