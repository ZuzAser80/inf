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
        int g = 0;
        int strgs = 0;
        int pcgs = 0;
        while (all > 0)
        {
            if (g <= 100)
            {
                g++;
                if (all >= 100)
                {
                    all -= 100;
                    brls++;
                }
                if (all >= 50)
                {
                    all -= 50;
                    strgs++;
                }
                if (all >= 0.5)
                {
                    all -= 0.5;
                    pcgs++;
                }
            }
        }
        System.out.print(brls + " " + strgs + " " + pcgs);
    }
}
