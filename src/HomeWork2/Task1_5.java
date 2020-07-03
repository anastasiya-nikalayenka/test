package HomeWork2;

public class Task1_5 {
    public static void main(String[] args) {
        long a = 1;
        for(int i=0; i<1000000000; i++) {
            a *= 3;
        }
        System.out.println(a);
    }
}
