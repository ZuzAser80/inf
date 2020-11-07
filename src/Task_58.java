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
        for (int brl = 0;brl <= 100;brl++)
        {
            for (int s = 0;s <= 100;s++)
            {
                int pcgs = 100 - brl - s;
                double total = brl * 100 + s * 50 + pcgs * 0.5;
                if (pcgs >= 0 && total<= 1000)
                {
                    System.out.println("Бочек: = " + brl + " Ящиков: = " + s + " Пакетов: " + pcgs + ", общий вес: " + total);
                }
            }
        }
//        System.out.print(brls + " " + strgs + " " + pcgs);
    }
}
