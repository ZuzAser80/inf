import java.util.Scanner;


/**
 * Created by Danil on 10.10.2020.
 *
 * Даны три числа a, b, c. Определить, какое из них равно d. Если равных d чисел нет, то найти  максимальное из  d-a, d-b, d-c.
 */
public class TwoDotTenSecondBlockSecond
{
    public static void main(String[] args)
    {

        Scanner ds = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = ds.nextInt();
        System.out.println("Введите число b");
        int b = ds.nextInt();
        System.out.println("Введите число c");
        int c = ds.nextInt();
        System.out.println("Введите число d");
        int d = ds.nextInt();
        int max;

            if (a == d) //например эта дублирует первую часть a == d ||
            {
                System.out.print("a == d");
            }
            if (b == d) // эта дублирует вторую часть b == d ||
            {
                System.out.print("b == d");
            }
            if (c == d) //дублирует третью часть, в итоге у тебя должен получиться "плоский" if - then - else без вложенных проверок
            {
                System.out.print("c == d");
            }


            if (d - a >= d - b && d - a >= d - c)
            {
                max = d - a;
                System.out.print("d  - a = " + max);
            }
            if (d - b >= d - a && d - b >= d - c)
            {
                max = d - b;
                System.out.print("d - b = " + max);
            }
            if (d - c >= d - b && d - c >= d - a)
            {
                max = d - c;
                System.out.print("d - c = " + max);
            }



        
    }
}
