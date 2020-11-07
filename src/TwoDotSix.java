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
        System.out.println("Введите длинну стороны прямоугольника");
        int i = sc.nextInt();
        System.out.println("Введите длинну второй стороны прямоугольника");
        int i2 = sc.nextInt();
        int perim = i * 2 + i2 * 2;
        int sqare = i * i2;
        System.out.println("Perimetr " + perim + " Sqare " + sqare);
    }
}
