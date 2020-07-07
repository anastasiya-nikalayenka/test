package HomeWork3.obj1.dto1;

public class Find {
    private int[] arr;

    public Find(int[] arr) {
        this.arr = arr;
    }

    public int findNumber(int[] arr) {
        int j = 1;
        int i = 0;
        int num = arr[0];
        for (i = 1; i < arr.length; i++) {

            if (arr[i] == num) {
                num = arr[i];
                j++;
            } else {
                if (j % 2 != 0) {
                    System.out.println("answer: " + num);
                    break;
                } else {
                    j = 1;
                    num = arr[i];
                }
            }
        }
        return num;
    }

    public int findNumber1(int[] arr) {
        int j = 1;
        int i = 0;
        int num = arr[0];
        for (i = 1; i < arr.length; i++) {

            if (arr[i] == num) {
                num = arr[i];
                j++;
            } else {
                if (j % 2 != 0) {
                    System.out.println("answer: " + num);
                    break;
                } else {
                    j = 1;
                    num = arr[i];
                }
            }
        }
        if (arr.length==1) {
            System.out.println("answer:" + arr[arr.length - 1]);
        }
        return num;
    }
}
