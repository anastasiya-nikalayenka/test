package HomeWork2;


public class Task1_3 {
    public static void main(String[] args) {

        int i=0; Integer num=0; int y=0;
        int[] arr = new int[0];
        String str1;

        System.out.println(args[0]);

        Integer[] intarray=new Integer[args.length];
        for(String str:args) {
            intarray[i]=Integer.parseInt(str);
            i++;
        }

        for(i=0;i<intarray.length;i++) {
            System.out.println(intarray[i]);
        }

        for (String str : args) {
            System.out.println(str);
        }
    }
}
