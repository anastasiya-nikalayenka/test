package HomeWork1;

import java.util.Scanner;

public class Names2 {
    public static void main(String[] args) {
        String temp1 = "Вася";
        String temp2 = "Анастасия";
        System.out.println("Пожалуйста введите имя (например Вася, Анастасия):");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if (name.equals(temp1)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
        }

        else if (name.equals(temp2)) {
            System.out.println("Я тебя так долго ждал.");
        }

        else {
            System.out.println("Добрый день, а вы кто?");
        }

    }
}
