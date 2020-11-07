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
        System.out.println("Введите число n");
        int n = sc.nextInt();
        int min = 9;
        do
        {
            int g = n % 10;

            n = n / 10;
            if (g < min)
            {
                min = g;
            }
        }
        while (n > 0);
        System.out.println(min);
    }
}
