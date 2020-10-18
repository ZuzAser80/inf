import java.util.Scanner;

/**
 * Created by Danil on 10.10.2020.
 */
/**
Напечатать программу, которая при введенном возрасте человека печатает его возрастную категорию:
дошкольник, ученик, работник, пенсионер.
*/
public class TwoDotTen
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int aa = a.nextInt();
        //TODO: добавить граничные условия, сейчас 7, 18, 23, 65 никуда не попадает
        if (aa < 7)
        {
            System.out.println("Doshcolnic");
        }
        else if (aa > 7 && aa < 18)
        {
            System.out.println("Shcolnic");
        }
        else if (aa > 18 && aa < 23)
        {
            System.out.println("Student");
        }
        else if (aa > 23 && aa < 65)
        {
            System.out.println("Rabochii");
        }
        else if (aa > 65)
        {
            System.out.println("Pensioner");
        }
    }
}
