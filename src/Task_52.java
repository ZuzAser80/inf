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
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        System.out.println("Введите число k");
        int k = sc.nextInt();
        int r = razrad(n);
        n = (int)(n + k * Math.pow(10, r));
        n = n * 10;
        n += k;
        System.out.println(n);
    }
    static int razrad(int n) {
        int r = 0;
        int k = n;
        do {k = k /10; r++;} while (k > 0);
        return r;
    }
}
