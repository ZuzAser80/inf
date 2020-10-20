import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.16.3.2
Составить программу к задаче «Дано число n. Если количество цифр в числе нечетное, то заменить среднюю цифру нулем».
 */
public class Task_54
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n;
        int g = 0;
        double s = 0;
        int counter = 0;
        int f = 1;
        while (d % 10 != 0)
        {
            int h = d % 10;
            d = d / 10;
            counter++;
        }
        if (counter % 2 != 0)
        {
            counter++;
            g = counter / 2;
            System.out.println(g);

        }
        s = Math.pow(g, f) / 100;
        n -= s;
        System.out.println(n);
    }
}
