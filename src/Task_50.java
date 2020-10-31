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
        int n = sc.nextInt();
        int max = 0;
        int f = 0;
        while (n % 10 != 0) //TODO: если ввести 10 то цикл вообще не будет выполняться, нужно поправить условие цикла
        {
            int g = n % 10;
            n = n / 10;
        }
        System.out.println(max);
        System.out.println(f);
    }
}
