import java.util.Scanner;

/**
 * Created by Danil on 10.10.2020.
 */
/*
2.5 last task
 */
//TODO: добавить описание задачи
public class TwoFiveLast {
    public static  void main(String[] args)
    {

        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        int c = cs.nextInt();
        int sum = a + b + c;
        int umn = a * b * c;
        double aqv = (a * b * c) / 3;
        System.out.println("Summa " + sum + " Prpoizv " + umn + " SradArifm " + aqv);

    }
}
