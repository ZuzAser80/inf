package Fourteen_FiveTeeen_Thirdteeen;

import java.util.Scanner;

/**
 * Created by Danil on 13.10.2020.
 */
/*
2.14.2.5
Составьте программу к задаче
 «В первый день выручка предпринимателя составила k рублей.
 Каждый последующий день выручка увеличивалась на 15 %.
 Вырученные деньги складываются в копилку.
 Сколько потребуется дней, чтобы заработать 1000000?
 */
public class Task_34
{
    //TODO: отформатировать код!
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double k = sc.nextInt();
    int c = 0;
    int d = 1;
    while (c < 1000000)
    {
        d++;
        c += k;
        k = k * 1.15;
    }
        System.out.println(d); //TODO: аналогично Task_32 нужно выводить не только цифру, но и пояснение
    }
}
