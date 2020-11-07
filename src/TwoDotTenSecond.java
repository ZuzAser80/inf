import java.util.Scanner;

/**
 * Created by Danil on 10.10.2020.
 */
/*
2.10.1.5
Составить программу, которая при введенном возрасте человека правильно печатает: «Вам х лет (год, года)!».
 */
public class TwoDotTenSecond
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Вам " + printAges(i));
    }

    static String printAges(int age) {
        if (age >= 10 && age <= 20)
        {
            return "лет";
        }
        if (age == 1)
        {
            return "год";
        }
        if (age % 2 != 0)
        {
            if (age <= 4 || age % 10 == 3)
            {
                return "года";
            }
            else
            {
                if (age % 10 == 1)
                {

                    return "год";
                }
                else
                {
                    return "лет";
                }
            }
        }
        if (age % 2 == 0)
        {
            if (age % 10 ==  4 || age <= 4 || age % 10 == 2)
            {
                return "года";
            }
            else
            {
                return "лет";
            }

        }

        return "---";
    }
}
