/**
 * Created by Danil on 18.10.2020.
 */
/*
2.13.1.4
Составить программу к задаче:
«Необходимо перевезти груз через реку.
Бочки весят 100 кг, ящики – 50 кг, а пакеты – 0.5 кг.
Плот выдержит 1 тонну груза.
Как укомплектовать плот, если требуется перевезти 100 предметов?».
 */
public class Task_58
{
    public static void main(String[] args)
    {
        double all = 1000;
        int brls = 0;
        int g = 1;
        int strgs = 0;
        int pcgs = 0;

        for (int p = 1;p <=100; p++) //
        {
            for (int b = 1; b <= 100; b++) {
                int pkg = 100 - b - p;
                if (pkg >= 0 && pkg <= 100 && p*100 + b * 50 + pkg * 0.5 <= 1000) {
//                    System.out.println(...);
                }
            }
        }

        while (all > 0 && g <= 100)
        {
                // у тебя есть два равенства, которые связывают бочки, ящики и пакеты:
                // (1) бочки + ящики + пакеты = 100
                // (2) бочки * 100 + ящики * 50 + пакеты * 0.5 = 1000
                // предлагаю сделать два вложенных цикла, один перебирает бочки от 0 до 100, второй перебирает ящики от 0 до 100
                // внутри вложенного цикла по бочкам и ящикам вычислям количество пакетов: пакеты = 100 - бочки - ящики
                // дальше проверяем что (1) количество пакетов больше или равно нуля и (2) что выполняется бочки * 100 + ящики * 50 + пакеты * 0.5 = 1000
                // если оба условия выполняются можно вывест в консоль количество бочек, ящиков и пакетов.
                // комбинаций должно получиться несколько
                g++;
                for (int brl = 0;brl <= 100;brl++)
                {
                    brls++;
                    for (int s = 0;s <= 100;s++)
                    {
                        strgs++;
                        pcgs = 100 - brls - strgs;
                        if (pcgs >= 0 && brls * 100 + strgs * 50 + pcgs * 0.5 == 1000)
                        {
                            System.out.println("Бочек: = " + brls + " Ящиков: = " + strgs + " Пакетов: " + pcgs);
                        }
                    }
                }
        }
        System.out.print(brls + " " + strgs + " " + pcgs);
    }
}
