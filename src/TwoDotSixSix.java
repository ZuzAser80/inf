import java.util.Scanner;

/**
 * Created by Danil on 10.10.2020.
 */
/*
2.6 6 task
Дан круг радиуса R. Найти длину окружности
 */
public class TwoDotSixSix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double g = Math.PI * 2 * r;
        System.out.println(g);
    }
}
