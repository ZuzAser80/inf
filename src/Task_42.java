import java.util.Scanner;

/**
 * Created by Danil on 16.10.2020.
 */
/*
2.16.1.3
Составить программу к задаче «Дано число n. Найти произведение его цифр».
 */
public class Task_42
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str = 1;
        while (n % 10 != 0) //TODO: если ввести 10 то цикл вообще не будет выполняться, нужно поправить условие цикла
        {
            int g = n % 10;
            n = n / 10;
            str = str * g;
        }
        System.out.println(str);
    }
}
