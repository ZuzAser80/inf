import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.16.3.3
 */
public class Task_55
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String h = Integer.toString(n);
        String f = h + h;
        System.out.println(f);
    }
}
