package HomeWork2;

public class Task2_2 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,45,123,1,5,23};
        for(int i=0;i<arr.length+1;i++) {
            if (i % 2 != 0) {
            System.out.println(arr[i]);
            }
        }
    }
}
