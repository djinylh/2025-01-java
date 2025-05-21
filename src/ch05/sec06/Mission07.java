package ch05.sec06;

import java.util.Arrays;

public class Mission07 {
    public static void main(String[] args) {
        int[] arr = {77,34,109,21,101,48};


        //arr 배열에서 가장 큰 값 찾기

        int[]arr2 = new int[arr.length];

        int max =arr[0];

        for(int a=0; a<arr.length;a++){
            if(arr[a]>max){
                max = arr[a];
            }


        }
        System.out.println(max);
    }}



