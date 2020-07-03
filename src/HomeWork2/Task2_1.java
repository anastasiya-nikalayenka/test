package HomeWork2;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int k=0;

        System.out.println("Please, enter array length:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Please, enter array:");
        for(i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }

        System.out.println(System.lineSeparator() + "1. For:");
        for(i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        System.out.println(System.lineSeparator() + "2. Foreach:");
        for(int element: arr) {
            System.out.println(element);
        }

        System.out.println(System.lineSeparator() + "3. Do...while:");
        do{
            if (k >= arr.length) {
                break;
            }
            System.out.println(arr[k]);
            k++;
        } while (k<arr.length);

        System.out.println(System.lineSeparator() + "4. While:");
        while (j<arr.length) {
            if (j == arr.length) {
                break;
            }
            System.out.println(arr[j++]);
        }
    }
}
