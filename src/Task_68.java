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
        int i;
        for (i = 1;i <= n;i++)
        {
            if (isSimple(i))
            {
                System.out.println(i);
            }
        }
    }
    static boolean isSimple(int c) {
        for (int i = 2;i < c; i++) {
            if (c % i == 0) {
                return false;
            }
        }
        return true;
    }
}
