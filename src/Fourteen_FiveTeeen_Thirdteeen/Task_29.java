package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
//
public class Task_29
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = sc.nextInt();
        while (i != x)
        {
            if (i > x)
            {
                System.out.print("МНОГО");
            }
            if (i < x)
            {
                System.out.println("МАЛО");
            }
            i = sc.nextInt();

        }
    }
}
