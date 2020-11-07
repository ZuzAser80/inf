import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.16.3.1
Составить программу к задаче «Дано число n. Получить новое число, приписав к нему такое же».
 */
public class Task_53
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        int r = razrad(n);
        n = (int)(n * Math.pow(10, r) + n);
        System.out.println(n);
    }
    static int razrad(int n) {
        int r = 0;
        int k = n;
        do {k = k /10; r++;} while (k > 0);
        return r;
    }
}
