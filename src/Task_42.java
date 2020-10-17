import java.util.Scanner;

/**
 * Created by Danil on 16.10.2020.
 */
/*
2.16.1.3
Составить программу к задаче «Дано число n. Найти произведение его цифр».
 */
public class Task_42
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str = 1;
        String h = Integer.toString(n);
        for (int i = 0;i < h.length();i++) //TODO: лучше сделать деление пока n > 10
        {
            int g = n % 10;
            str = g * (n / 10) % 10;

        }
        System.out.println(str);
    }
}
