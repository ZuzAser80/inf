import java.util.Scanner;

/**
 * Created by Danil on 19.10.2020.
 */
/*
2.13.3.4
Составить программу к задаче
«Дано число n. Является ли оно «перевертышем»?».
 */
public class Task_66
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        int g = n;
        int a = g % 10;
        g = g / 10;
        int b = g % 10;
        g = g / 10;
        int c = g % 10;
        g = g / 10;
        int d = g % 10;
        if (a == d && b == c && d != c)
        {
            System.out.println(n + " является 'перевертышем'");
        }
        else
        {
            System.out.println(n + " не является 'перевертышем'");
        }
    }
}
