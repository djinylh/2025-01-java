package ch05.sec06;

import java.util.Arrays;


public class Mission03_01 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 30, 40, 50,60};
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------");
        //


        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            }
        System.out.println(Arrays.toString(arr2));
        }
}
