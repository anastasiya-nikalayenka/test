package HomeWork2;

public class Task1_5 {
    public static void main(String[] args) {
        long a = 1;
        long maxValue = 9223372036854775807L;
        for(; ;) {
            a *= 3;
            if (a>=maxValue) {
                System.out.println("limit!" + a);
                break;
            }
        }
        System.out.println(a);
    }
}
