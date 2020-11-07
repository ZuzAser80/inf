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
        int r = razrad(n);
        if (r % 2 != 0)
        {
            r = r / 2;
            int g = (int)(n / Math.pow(10, r));
            g = g % 10;
            n -= (int)(g * Math.pow(10, r));
            System.out.println("4исло n = " + n);
        }
        else
        {
            System.out.println("Разрядов чётное колчество.");
        }
    }
    static int razrad(int n) {
        int r = 0;
        int k = n;
        do {k = k /10; r++;} while (k > 0);
        return r;
    }
}
