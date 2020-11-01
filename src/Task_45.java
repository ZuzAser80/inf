import java.util.Scanner;

/**
 * Created by Danil on 16.10.2020.
 */
/*
2.16.1.6
Составить программу к задаче «Дано число n. Найти сумму его четных цифр и произведение нечетных».
 */
public class Task_45
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        int i = 1;
        while (n / 10 != 0)
        {
            int g = n % 10;
            if (g % 2 == 0)
            {
                d += g;
            }
            else
            {
                i =  i *  g;
            }
            n = n / 10;
        }
        System.out.println("Proizv = " + i);
        System.out.println("Sum = " + d);

    }
}
