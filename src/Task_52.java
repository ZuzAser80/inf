import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.16.2.5
Составить програм к задаче «Дано число n и цифра k. Дописать цифру k в начало и конец числа».
 */
public class Task_52
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        double max = 0;
        int d = n;
        double f = 0;
        while (n / 10 != 0)
        {
            int g = n % 10;
            n = n / 10;
        }
        double s = Math.pow(max, 1) * 10;
        String h = Integer.toString(n);
        double s1 = Math.pow(max, h.length()) * 10;
        d -= s;
        System.out.println(d);
    }
}
