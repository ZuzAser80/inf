import java.util.Scanner;

/**
 * Created by Danil on 10.10.2020.
 */
/*
2.10.1.5
Составить программу, которая при введенном возрасте человека правильно печатает: «Вам х лет (год, года)!».
 */
/*

10 <
1 - год
2, 3, 4 - года
5, 6, 7, 8, 9, 10 - лет

11 - 20  - лет

20 >
X1 - год
X2, X3 , X4 - года
X5, X6, X7, X8, X9, (X+1)0 - лет

 */
public class TwoDotTenSecond
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        for (int i = 1;i < 100;i++) {
            System.out.println("Вам " + i + " " + printAges(i));
        }
    }

    static String printAges(int age) {
        if (age >= 10 && age <= 20)
        {
            return "год";
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
