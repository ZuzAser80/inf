import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.16.2.3
Составить программу к задаче «Дано число n. Обрезать первую и последнюю цифры».
 */
public class Task_50
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        int max = 0;
        int f = 0;
        do
        {
            int g = n % 10;
            n = n / 10;
        }
        while (n > 0);
        System.out.println(max);
        System.out.println(f);
    }
}
