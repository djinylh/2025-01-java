package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random() *100.0 ) +1;
        System.out.println("1-100사이 숫자를 입력해주세요");
        System.out.println("answer: " + answer);
        boolean run = true;

        while(true){
            int num = scanner.nextInt();
            if (answer == num){
                run = false;
                System.out.println("정답!");
                break; // break를 감싸고 있는 반복문에서 멈춘다.
            } else if (answer < num){
                System.out.println(" Down! ");
            } else {
                System.out.println(" Up !");
            }
        }
        /*
        반복문
         */
    }
}
