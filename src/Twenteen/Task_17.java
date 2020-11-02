package Twenteen;
/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.7
Составить программу к решению задачи:
«Вывести на экран ряд, в котором будут записаны степени числа 3,
начиная с нулевой и заканчивая десятой».
 */
public class Task_17
{
    public static void main(String[] args)
    {
        //Stepeni
        int end = 1;
        for (int i = 0;i <= 10;i++)
        {
            for (int i1 = 0;i1 < i;i1++)
            {
                end  = end * 3;
            }
            System.out.print(end + " ");
            end = 1;
        }
        System.out.println();
    }
}
