package ch04;

public class Even0dd {
    public static void main(String[] args) {
        //홀, 짝 + 랜덤 숫자
        int num = 101;
        //mod %연산자 사용
        System.out.printf("%d / %d = %d\n", num, 5, num / 5);
        System.out.printf("%d %% %d = %d\n", num, 5, num % 5);

        // mod를 이용해 짝인지 홀인지 구분
        if (num % 2 == 0 ) {
            System.out.printf( "%d는 짝수 입니다\n", num);
        }
        else {
            System.out.printf("%d는 홀수 입니다\n", num);
        }



    }
}
