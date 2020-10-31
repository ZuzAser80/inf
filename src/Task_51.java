import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.16.2.4
Составить программу к задаче «Дано число n и цифра k. Заменить первую цифру цифрой k».
 */
public class Task_51
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int f = 0;
        //TODO: если ввести 10 то цикл вообще не будет выполняться, нужно поправить условие цикла
        //я бы заменил условие в цикле на деление числа n до тех пор, n > 10
        while (n % 10 != 0)
        {
            int g = n % 10;
            n = n / 10;
            f = g;
        }
        //TODO: вот тут не понятно, что происходит
        while (n % 10 != 0)
        {
            int g = n % 10;
            if (g == f)
            {
                n = k;
            }
            n = n / 10;
        }
        System.out.println(n);
    }
}
