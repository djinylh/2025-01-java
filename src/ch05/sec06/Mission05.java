package ch05.sec06;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // for 쓰기용 ( 10,11,12,13,....19)
        for(int i=0; i<arr.length; i++){
            arr[i] = i +10;
        }





        //for 출력용 (읽기 후 출력)
        //arr[0]: 10
        for(int a = 0; a < arr.length; a++) {
            System.out.printf("arr[%d] : %d\n",a, arr[a]);


        }




    }
}
