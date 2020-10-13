import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.1.8
Составьте программу к задаче
«Дано число x. Делить его на 2 нацело, пока оно не обратится в 0. Посчитать количество делений».
 */
public class Task_31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int counter = 0;
        while (x != 0)
        {
            x = x / 2;
            counter++;
        }
        System.out.println(counter);
    }
}
