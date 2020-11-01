import java.util.Scanner;

/**
 * Created by Danil on 09.10.2020.
 */
/*
2.5 prelast
Написать программу, выводящую на экран картинку:
0 0 0 0 0 0
0 А А А А 0
0 А Х Х А 0
0 А Х Х А 0
0 А А А А 0
0 0 0 0 0 0
 */

public class ThreeDotFour
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String a = sc.nextLine();
        System.out.println("0 0 0 0 0 0");
        System.out.println("0 " + a + " " + a + " " + a + " " + a + " 0");
        System.out.println("0 " + a + " " + x + " " + x + " " + a + " 0");
        System.out.println("0 " + a + " " + x + " " + x + " " + a + " 0");
        System.out.println("0 " + a + " " + a + " " + a + " " + a + " 0");
        System.out.println("0 0 0 0 0 0");

    }
}
