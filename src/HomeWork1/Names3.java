package HomeWork1;

import java.util.Scanner;

public class Names3 {
    public static void main(String[] args) {

        System.out.println("Пожалуйста введите имя (например Вася, Анастасия):");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
       switch (name)
        {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
            break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
                break;

        }
    }
}

