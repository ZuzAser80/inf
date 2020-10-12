package Twenteen;

import java.util.Scanner;

/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.5
 */
public class Task_15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stg = 1;
        for (int i = 0;i < n;i++)
        {
            int d = sc.nextInt();
            String s = Integer.toString(d);
            if (s.endsWith("3"))
            {
                stg = stg * d;
            }
        }
        System.out.println(stg);
    }
}
