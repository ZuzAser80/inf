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
        int strg = 0;
        for (int i = 1;i <= n;i++)
        {

                f = isS(i + 1);
                if (f > isS(i))
                {
                    strg = f;
                }
                else
                {
                    strg = isS(i);
                }


        }
        System.out.println(strg);
    }
    static int isS(int i)
    {
        for (int g = 1;g < i;g++)
        {
            if (i % g == 0)
            {
                return i;
            }
        }
        return 0;
    }
}
