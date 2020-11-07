import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.16.2.3
Составить программу к задаче «Дано число n. Обрезать первую и последнюю цифры».
 */
public class Task_50
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        int r = razrad(n) - 1;
        n = (int)( n % Math.pow(10, r));
        System.out.println(n / 10);
    }

    static int razrad(int n) {
        int r = 0;
        int k = n;
        do {k = k /10; r++;} while (k > 0);
        return r;
    }
}
