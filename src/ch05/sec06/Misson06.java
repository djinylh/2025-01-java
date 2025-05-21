package ch05.sec06;


import java.util.Scanner;
public class Misson06 {
    public static void main(String[] args) {
        // 절대값 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요>");
        int a = scanner.nextInt();
        int num = a;
        if( num<0){
            a = -num;
        }


        System.out.println(a);
    }
}

