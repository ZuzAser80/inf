import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by Danil on 16.10.2020.
 */
/*
2.16.1.6
Составить программу к задаче «Дано число n. Найти сумму его четных цифр и произведение нечетных».
TODO: second task block
 */
public class Task_45
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        int i;
        String h = Integer.toString(n);
        for (i = 0;i < h.length();i++)
        {
            int g = n % 10;
            if (g % 2 == 0)
            {
                d++;
            }
            else
            {

            }
            n = n / 10;
        }
        System.out.println(d);

    }
}
