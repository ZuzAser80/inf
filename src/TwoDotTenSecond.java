import java.util.Scanner;

/**
 * Created by Danil on 10.10.2020.
 */
//TODO: добавить описание задачи
//TODO: задача не решена, мы с тобой тогда таблицу составляли
public class TwoDotTenSecond
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String g = Integer.toString(a);
        String Ending = "";

        if (a % 2 == 0)
        {
            Ending  = "лет";
        }
        else if (a % 2 != 0)
        {
            Ending = "года";
        }
        if (a % 10 == 1)
        {

            Ending = "год";
        }
        System.out.println("Вам " + a + " " + Ending);
    }
}
