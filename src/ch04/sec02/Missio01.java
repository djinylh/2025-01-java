package ch04.sec02;

public class Missio01 {
    public static void main(String[] args) {
        // 5 ~ 10 사이 랜덤값

        for(int i = 0; i < 1000; i++){
            int result = (int)(Math.random() * 6) +5 ;

            if(result < 5 || result>10) {
                System.out.println("틀렸음!");
                break;
            }

        }
            System.out.println("--끝--");
    }
}
