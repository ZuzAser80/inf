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
        System.out.print(brls + " " + strgs + " " + pcgs);
    }
}
