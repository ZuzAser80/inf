import java.util.Scanner;

/**
 * Created by Danil on 16.10.2020.
 */
/*
2.16.1.5
Составить программу к задаче «Дано число n. Найти сумму его нечетных цифр».
 */
public class Task_44
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        int i;
        while (n % 10 != 0)
        {
            int g = n % 10;
            if (g % 2 != 0)
            {
                d++;
            }
            n = n / 10;
        }
        System.out.println(d);

    }
}
