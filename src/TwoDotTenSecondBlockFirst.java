import java.util.Scanner;

/**
 * Created by Danil on 10.10.2020.
 *
 * Составить программу, определяющую: «попадет ли точка в заштрихованную область?».
 */
public class TwoDotTenSecondBlockFirst
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите макс.координату по х");
        int maxx = sc.nextInt();
        System.out.println("Введите макс.координату по у");
        int maxy = sc.nextInt();
        System.out.println("Введите мин.координату по х");
        int minx = sc.nextInt();
        System.out.println("Введите мин.координату по у");
        int miny = sc.nextInt();
        System.out.println("Введите координату по оси х");
        int x = sc.nextInt();
        System.out.println("Введите координату по оси у");
        int y = sc.nextInt();
        if (x > minx && y > miny && x < maxx && y < maxy)
        {
            System.out.println("Точка в области");
        }
        else if (x < minx && y < miny || x > maxx && y > maxy)
        {
            System.out.println("Точка вне области");
        }

    }
}
