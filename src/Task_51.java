import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.16.2.4
Составить программу к задаче «Дано число n и цифра k. Заменить первую цифру цифрой k».
 */
public class Task_51
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        System.out.println("Введите число k");
        int k = sc.nextInt();
        int f = 0;
        do
        {
            int g = n % 10;
            n = n / 10;
            f = g;
        }
        while (n > 0);
        System.out.println(n);
    }
}
