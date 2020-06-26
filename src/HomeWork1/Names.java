package HomeWork1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Names {
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

        if (name.equals(temp2)){
            System.out.println("Я тебя так долго ждал.");
        }

        if (!name.equals(temp1)&&!name.equals(temp2)){
            System.out.println("Добрый день, а вы кто?");
        }

    }

}
