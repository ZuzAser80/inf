import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Created by Danil on 18.10.2020.
 */
/*
2.13.1.5
Составить программу к задаче:
«В кассе остались купюры по 3 и 5 рублей.
Кассиру необходимо выдать сумму s рублей (известно, что s>7).
Какие могут быть варианты по количеству тех и других купюр?».
 */
public class Task_59
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int g = 0;
        int g1 = 0;
        while (s > 0) //TODO: сейчас програма ищет только один вариант, а нужны все. Поэтому нужно переделать на два вложенных цикла
        {
            if (s % 5 == 0) //TODO: а зачем делается деление? если s = 8 то ни одно из условий не будет выполнено
            {
                s -= 5;
                g++;
            }
            else if (s % 3 == 0)
            {
                s -= 3;
                g1++;
            }
        }
        System.out.println("5: " + g + " 3: " + g1);
    }
}
