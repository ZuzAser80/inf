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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
            for(int a = 1;a <= n;a++)
            {
                for (int b = a;b < n;b++)
                {

                    int d = a * a + b * b;
                    int c = 1;
                    while (c * c != d && c < n)
                    {
                        c++;
                    }
                    if (d == c * c && c < n)
                    {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
    }
}


