package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[] {4,1,6,9,2};
        boolean flag = false;
        boolean flag1 = false;
        int buffer;
        int i=0;


        System.out.println("Please, enter array length:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] arr1 = new int[size];
        System.out.println("Please, enter array:");
        for(i=0;i<arr1.length;i++) {
            arr1[i]=scan.nextInt();
        }

        while (!flag) {
            flag=true;
            for(i=0;i<arr1.length-1;i++) {
                if (arr1[i]>arr1[i+1]) {
                    flag=false;
                    buffer=arr1[i];
                    arr1[i]=arr1[i+1];
                    arr1[i+1]=buffer;
                }
            }
        }
        System.out.println("Your array: " + Arrays.toString(arr1));

        while (!flag1) {
                flag1=true;
                for(i=0;i<arr.length-1;i++) {
                    if (arr[i]>arr[i+1]) {
                        flag1=false;
                        buffer=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=buffer;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
    }
}
