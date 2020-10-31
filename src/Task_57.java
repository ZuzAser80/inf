import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.13.1.3
Составить программу к задаче:
«Сколько шансов при бросании трех игральных костей выбросить х очков (от 3 до 18) и какие это варианты».
 */
public class Task_57
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double k = 0;
        for (int i = 1;i <= 6;i++)
        {
            for (int i1 = 1;i1 <= 6;i1++)
            {
                for (int i2 = 1;i2 <= 6;i2++)
                {
                    int g = i + i1 + i2;
                    if (x == g)
                    {
                        System.out.println(i + " " + i1 + " " + i2);
                    }
                    k++; //TODO: k наверное должно увеличиваться только когда условие выполняется, если нам нужно посчитать количество варинтов?
                }
            }
        }
        System.out.println(k / 100);
    }
}
