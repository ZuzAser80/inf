import java.util.Scanner;

/**
 * Created by Danil on 19.10.2020.
 */
/*
2.16.3.5
Составить программу к задаче
«Дано число n. Заменить его максимальную цифру нулем».
 */
public class Task_65
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double max = 0;
        int d = n;
        double f = 0;
        while (n % 10 != 0)
        {
            int g = n % 10;
            n = n / 10;
            if (g >= max)
            {
                max = g;

            }
            else
            {
                f++;
            }
        }
        double s = Math.pow(max, f) * 10;
        d -= s;
        System.out.println(d);
    }
}
