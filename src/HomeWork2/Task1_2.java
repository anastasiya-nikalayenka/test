package HomeWork2;

public class Task1_2 {
    public static void main(String[] args) {
        int i=0;
        int k=0;
        Integer result=1;

        String str = args[0];

        Integer[] arr = new Integer[args.length];
        arr[0] = Integer.parseInt(str);
        System.out.println("Argument: " + arr[0]);

        Integer number = arr[0];

        Integer[] newArr = new Integer[number+1];

        for(i=1;i<number+1;i++) {
            k++;
            newArr[i]=k;
            result*=newArr[i];
            System.out.println(newArr[i]);
        }
        System.out.println("Result= " + result);
    }
}
