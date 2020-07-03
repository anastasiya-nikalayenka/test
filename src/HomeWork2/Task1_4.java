package HomeWork2;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        int result=1;

        System.out.println("Please, enter the 1st number:");
        Scanner scan1 = new Scanner(System.in);
        int number1 = scan1.nextInt();

        System.out.println("Please, enter the second number:");
        Scanner scan2 = new Scanner(System.in);
        int number2 = scan2.nextInt();

        int[] arr = new int[number2+1];
        for(int i=1;i<number2+1;i++)
        {
            arr[i]=number1;
            result*=arr[i];
            //System.out.println(arr[i]);
        }
        System.out.println(result);
    }
}
