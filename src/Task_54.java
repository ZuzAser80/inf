import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.16.3.2
Составить программу к задаче «Дано число n. Если количество цифр в числе нечетное, то заменить среднюю цифру нулем».
 */
public class Task_54
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n;
        int g = n;
        int max = 0;
        double v = 0;
        double s = 0;
        int a = 0;
        int counter = 0;
        int f = 1;
        while (d % 10 != 0) //TODO: если ввести 10 то цикл вообще не будет выполняться, нужно поправить условие цикла
        {
            int h = d % 10;
            d = d / 10;
            counter++;
        }
        //TODO: а что эти цикл делает?
        while (g % 10 != 0)
        {
            int h = g % 10;
            g = g / 10;
            a++;
            if (a == counter / 2 + 1)
            {
                max = h;
            }
        }
        int j = counter / 2;
        for (int q = 0;q < j;q++)
        {
            v = Math.pow(max, q); //TODO: зачем max возводиться в степень q
        }
        s = v * 100;
        n -= s;
        System.out.println(n);
    }
}
