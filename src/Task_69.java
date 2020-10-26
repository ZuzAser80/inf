import java.util.Scanner;

/**
 * Created by Danil on 19.10.2020.
 */
/*
2.13.2.5
Составить программу к задаче:
«Напечатайте число из промежутка от 1 до n с наибольшим количеством делителей».
 */
public class Task_69
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int max = 0;
        int strg = 0;
        for (int i = 0;i <= n;i++)
        {
           if (Proc(i) >= Proc(max))
           {
               max = i;
           }
        }
        System.out.println(max);
    }
    static int Proc(int i)
    {
        int str = 0;
        for (int g = 1;g <= i;g++)
        {
            if (i % g == 0)
            {
                str++;
            }
        }
        return str;
    }
}
