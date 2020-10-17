import java.util.Scanner;

/**
 * Created by Danil on 15.10.2020.
 */
/*
2.16.1.2
Составить программу к задаче «Дано число n. Напечатать его цифры в столбик, начиная с последней цифры».
 */
public class Task_41
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String h = Integer.toString(n);
        for (int i = 0;i < h.length();i++) //TODO: нужно переделать на цикл деления пока n > 10
        {
            int g = n % 10;
            n = n / 10;
            System.out.println(g);
        }


    }
}
