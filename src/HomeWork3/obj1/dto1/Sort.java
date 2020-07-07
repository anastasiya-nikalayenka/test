package HomeWork3.obj1.dto1;

public class Sort {
    private int[] arr;

    public Sort(int[] arr) {
        this.arr = arr;
    }

    public int[] sortArray() {
        int[] array = arr;
        int buffer;
        int i=0;
        boolean flag=false;

        while (!flag) {
            flag = true;
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = false;
                    buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                }
            }
        }
        return array;
    }
}


