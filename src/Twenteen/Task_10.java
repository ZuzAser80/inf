package Twenteen;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.2.7
TODO: таблица
 */
public class Task_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = ThreadLocalRandom.current().nextInt(-10, 10);
        System.out.print("y = " + a * x + b);
    }
}
