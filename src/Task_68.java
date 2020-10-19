import java.util.Scanner;

/**
 * Created by Danil on 19.10.2020.
 */
/*
2.13.2.4
Составить программу к задаче: «Распечатайте все простые числа из промежутка от 1 до n».
 */
public class Task_68
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        for (int i = 1;i <= n;i++)
        {
            for (int g = 2;g < i;g++)
            {
                if (i % g != 0)
                {

                }
            }
        }
    }
}
