package HomeWork1;
import java.util.Scanner;

public class Sleep
{
    public static void main(String[] args)
    {
        boolean weekday = true;
        boolean vacation = false;
        String ans = "да";


        System.out.println("Пожалуйста ответьте на вопрос. да/нет");
        System.out.println("Сегодня рабочий день?");
        Scanner scan1 = new Scanner(System.in);
        String answer1 = scan1.nextLine();

        System.out.println("У вас отпуск?");
        Scanner scan2 = new Scanner(System.in);
        String answer2 = scan2.nextLine();

        if (answer1.equals(ans))
        {
            weekday = true;
        }
        else
        {
            weekday = false;
        }

        if (answer2.equals(ans))
        {
            vacation = true;
        }
        else
        {
            vacation = false;
        }


        System.out.println(sleepIn(weekday,vacation));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation)
    {

        if (weekday&&!vacation)
        {
            System.out.println("Не спи!");
            return false;
        }
        else
        {
            System.out.println("Все в порядке. Продолжай спать дальше");
            return true;
        }


    }


    }













