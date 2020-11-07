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
        System.out.println("Введите число n");
        int n = sc.nextInt();
        int max = 0;
        double v = 0;
        double s = 0;
        int counter = 0;
        int f = 1;
        do
        {
            n = n / 10;
            counter++;
        }
        while (n > 0);
        int j = counter / 2;
        for (int q = 0;q < j;q++)
        {
            v = Math.pow(max, q);
        }
        s = v * 100;
        n -= s;
        System.out.println(n);
    }
}
