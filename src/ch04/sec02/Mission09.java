package ch04.sec02;

public class Mission09 {
    public static void main(String[] args){
        int dan = (int)(Math.random() * 8.0) +2 ;// 2~9 사이 랜덤값 생성
                System.out.println("dan: " + dan);
                for (int i = 1; i <=9; i++) {

                    System.out.println(dan + " x " + i + " = " + (dan * i));
                }


                /*
                dan : 2
                2 x 1 = 2
                2 x 2 = 4
                2 x 3 = 6
                ..
                ---

                dan : 9
                9 x 1 = 9
                9 x 2 = 18
                ...

                 */
    }
}
