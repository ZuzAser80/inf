/**
 * Created by Danil on 18.10.2020.
 */
/*
2.13.2.2
Составить программу печати трехзначных чисел, имеющих 10 делителей
*/
public class Task_63
{
    public static void main(String[] args)
    {
        for (int i = 10200;i < 19299;i += 1011)
        {
            if (i % 37 == 0)
            {
                System.out.println("1?2?? = " + i);
            }
        }
    }
}
