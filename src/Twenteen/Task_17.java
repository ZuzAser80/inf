package Twenteen;
/**
 * Created by Danil on 12.10.2020.
 */
/*
2.12.3.7
 */
//TODO : dodelat
public class Task_17
{
    public static void main(String[] args)
    {
        //Stepeni
        double end = 1;
        for (int i = 0;i < 10;i++)
        {
            for (double g = 1;g < i + 1;g++)
            {
                end += end * 3;
                System.out.println(end);
            }
        }
    }
}
