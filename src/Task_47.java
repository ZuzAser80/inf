import java.util.Scanner;

/**
 * Created by Danil on 16.10.2020.
 */
/*
2.16.1.8
Составить программу к задаче «Дано число n. Есть ли в нем цифра 5?».
 */
public class Task_47
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        boolean d = false;
        do
        {
            int g = n % 10;
            if (g == 5)
            {
                d = true;
            }
            n = n / 10;
        }
        while (n > 0);
        System.out.println(d);

    }
}
