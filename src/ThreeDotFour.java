import java.util.Scanner;

/**
 * Created by Danil on 09.10.2020.
 */
/*
2.5 prelast
 */
//TODO: добавить описание задачи
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
