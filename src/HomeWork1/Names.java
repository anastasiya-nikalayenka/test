package HomeWork1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {


        String temp1 = "����";
        String temp2 = "���������";
        System.out.println("���������� ������� ��� (�������� ����, ���������):");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if (name.equals(temp1)) {
            System.out.println("������!");
            System.out.println("� ���� ��� ����� ����.");
        }

        if (name.equals(temp2)){
            System.out.println("� ���� ��� ����� ����.");
        }

        if (!name.equals(temp1)&&!name.equals(temp2)){
            System.out.println("������ ����, � �� ���?");
        }

    }

}
