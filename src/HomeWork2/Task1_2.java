package HomeWork2;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        int i=0;
        int k=0;
        int[] arr;
        int result=1;
        System.out.println("Please enter number:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        arr = new int[number+1];
        for(i=1;i<number+1;i++) {
            k++;
            arr[i]=k;
            result*=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(result);
    }
}
