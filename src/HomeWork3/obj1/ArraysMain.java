package HomeWork3.obj1;

import HomeWork3.obj1.dto1.*;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] arr1 = new int[] {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        int[] arr2 = new int[] {1,1,2,-2,5,2,4,4,-1,-2,5};
        int[] arr3 = new int[] {20,1,1,2,2,3,3,5,5,4,20,4,5};
        int[] arr4 = new int[] {10};
        int[] arr5 = new int[] {1,1,1,1,1,1,10,1,1,1,1};
        int[] arr6 = new int[] {5,4,3,2,1,5,4,3,2,10,10};


        Sort sort1=new Sort(arr1);
        arr1=sort1.sortArray();


        Sort sort2=new Sort(arr2);
        arr2=sort2.sortArray();

        Sort sort3=new Sort(arr3);
        arr3=sort3.sortArray();

        Sort sort5=new Sort(arr5);
        arr5=sort5.sortArray();

        Sort sort6=new Sort(arr6);
        arr6=sort6.sortArray();


        System.out.println("1. Your array: " + Arrays.toString(arr1));
        Find find1=new Find(arr1);
        int num1=find1.findNumber(arr1);


        System.out.println("2. Your array: " + Arrays.toString(arr2));
        Find find2=new Find(arr2);
        int num2=find2.findNumber(arr2);


        System.out.println("3. Your array: " + Arrays.toString(arr3));
        Find find3=new Find(arr3);
        int num3=find3.findNumber(arr3);


        System.out.println("4. Your array: " + Arrays.toString(arr4));
        Find find4=new Find(arr4);
        int num4=find4.findNumber1(arr4);

        System.out.println("5. Your array: " + Arrays.toString(arr5));
        Find find5=new Find(arr5);
        int num5=find5.findNumber(arr5);

        System.out.println("6. Your array: " + Arrays.toString(arr6));
        Find find6=new Find(arr6);
        int num6=find6.findNumber(arr6);
    }


}
