package ch05.sec06;

import java.sql.SQLOutput;

public class MultiArrayStidy02 {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30},
                {40,50,60},
                {70}
        };
        System.out.println(arr.length);
        System.out.println("arr[0].length: " +arr[0].length);

         int[] child0 = arr[0];

        System.out.println("-------------------");

        for(int a =0; a < arr.length; a++) {
            for(int b =0; b < arr[a].length; b++){

                System.out.printf("%d ",arr[a][b]);
            }
            System.out.println();
        }



    }
}
