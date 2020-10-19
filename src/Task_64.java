import java.util.Scanner;

/**
 * Created by Danil on 19.10.2020.
 */
/*
2.13.2.3
Составить программу к задаче:
«Число называется «совершенным» если оно равно сумме всех своих делителей включая 1,
но не включая само себя.
Распечатайте все совершенные числа из промежутка от 1 до n».
 */
public class Task_64
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j;
        int s;
        int i;
        for (i = 1; i < n; i++)
        {
            s = 0;
            for (j=1; j < i; j++)
            {
                if (i % j == 0)
                {
                    s += j;
                }
            }
            if (s == i)
            {
                System.out.println(i);
            }
        }
    }
}
