package HomeWork2;


public class Task1_3 {
    public static void main(String[] args) {

        String str = args[0];
        int result=1;
        int[] arr = new int[str.length()];

        for (int i=0; i<str.length(); i++) {
            arr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        for(int i=0; i<arr.length; i++) {
            result*=arr[i];
        }

        System.out.println("4*3*2*4*3*2*4=" + result);
    }
}
