import java.util.Scanner;

/**
 * Created by Danil on 16.10.2020.
 */
/*
2.16.1.7
Составить программу к задаче «Дано число n. Сколько в нем нулей?».
 */
public class Task_46
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
            if (g == 0)
            {
                d++;
            }
            n = n / 10;
        }
        System.out.println(d);

    }
}
