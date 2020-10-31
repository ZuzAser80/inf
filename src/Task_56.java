import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.13.1.2
Составить программу к задаче:
«Сколько шансов при бросании двух игральных костей выбросить х очков (от 2 до 12) и какие это варианты».
 */
public class Task_56
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        for (int i = 1;i <= 6;i++)
        {
            for (int i1 = 1;i1 <= 6;i1++)
            {
                int g = i + i1;
                if (x == g)
                {
                    System.out.println(i + " " + i1);
                }
                k++; //TODO: k наверное должно увеличиваться только когда условие выполняется, если нам нужно посчитать количество варинтов?
            }
        }
    }
}
