import java.util.Scanner;

/**
 * Created by Danil on 16.10.2020.
 */
/*
2.16.2.1
Составить программу к задаче «Дано число n. Найти минимальную цифру».
 */
public class Task_48
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 9;
        while (n % 10 != 0)
        {
            int g = n % 10;

            n = n / 10;
            if (g < min)
            {
                min = g;
            }
        }
        System.out.println(min);
    }
}
