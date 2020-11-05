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
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        String g = Integer.toString(a);
//        String Ending = "";
//
//        if (a % 2 != 0)
//        {
//            Ending  = "лет";
//        }
//        else if (a % 2 == 0 || a <= 4)
//        {
//            Ending = "года";
//        }
//        if (a % 10 == 1)
//        {
//
//            Ending = "год";
//        }
//        System.out.println("Вам " + a + " " + Ending);
        for (int i = 1;i < 100;i++) {
            System.out.println("Вам " + i + " " + printAges(i));
        }
    }

    static String printAges(int age) {
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
