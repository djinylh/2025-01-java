package ch05.sec06;

import java.util.Arrays;

public class CopyStudy01 {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40};

        //arr1을 이용하여 똑같은 배열을 만든다
        // 1. 똑같은 크기의 공간 할당
        int[] arr2 = new int[arr1.length];

//        int[] arr3= {10,20,30};
       for(int i=0; i<arr1.length; i++){
           arr2[i] = arr1[i]; // 얕은 복사 (주소값을 복사)
       }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
