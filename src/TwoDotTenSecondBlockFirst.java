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
        int maxx = sc.nextInt();
        int maxy = sc.nextInt();
        int minx = sc.nextInt();
        int miny = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > minx && y > miny && x < maxx && y < maxy)
        {
            System.out.println("Точка в области");
        }
        else if (x < minx && y < miny || x > maxx && y > maxy) //TODO: а зачем тут второе условие?
        {
            System.out.println("Точка вне области");
        }

    }
}
