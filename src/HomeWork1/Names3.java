package HomeWork1;

import java.util.Scanner;

public class Names3 {
    public static void main(String[] args) {

        System.out.println("���������� ������� ��� (�������� ����, ���������):");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
       switch (name)
        {
            case "����":
                System.out.println("������!");
                System.out.println("� ���� ��� ����� ����.");
            break;

            case "���������":
                System.out.println("� ���� ��� ����� ����.");
                break;

            default:
                System.out.println("������ ����, � �� ���?");
                break;

        }
    }
}

