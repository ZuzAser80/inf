import java.util.Scanner;

/**
 * Created by Danil on 19.10.2020.
 */
/*
2.13.1.9
Составить программу к задаче:
«Числа a, b и c называются «пифагоровой тройкой»,
если выполняется условие a2+ b2 = c2.
Отыщите все «пифагоровы тройки» среди чисел от 1 до n».
 */
public class Task_67
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n;i++)
        {
            int g1 = i * i;
            int g2 = (i + 1) * (i + 1);
            int g3 = (i + 2) * (i + 2);
            if (g1 + g2 == g3)
            {
                System.out.println(g1);
                System.out.println(g2);
                System.out.println(g3);
            }
        }
    }


}
