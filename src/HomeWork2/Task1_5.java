package HomeWork2;

public class Task1_5 {
    public static void main(String[] args) {
        long a = 1;
        long value = 0;
        long[] arr = new long[100];

        for (; ; ) {
            while (a <= Long.MAX_VALUE || a > 0) {
                for (int i = 0; i < 100; i++) {
                    a *= 3;
                    arr[i] = a;
                    if (a >= Long.MAX_VALUE || a < 0) {
                        System.out.println(arr[i-1]);
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }
    }
}