import java.util.Scanner;

/**
 * Created by Danil on 10.10.2020.
 */
/*
2.6 four task
Даны стороны прямоугольника. Найти его периметр и площадь.
 */

public class TwoDotSix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i2 = sc.nextInt();
        int perim = i * 2 + i2 * 2;
        int sqare = i * i2;
        System.out.println("Perimetr " + perim + " Sqare " + sqare);
    }
}
