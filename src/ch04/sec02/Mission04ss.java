package ch04.sec02;

import java.util.Scanner;

public class Mission04ss {
    public static void main(String[] args) {
        //int score = (int) (Math.random() * 201.0);
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요: \n");
         int score = scan.nextInt(); // 직접 점수를 적할수 있음
        System.out.printf("score: %d\n", score);
        // 00 ~ 200사이의 랜덤값

        //만약 score 값이 100~ 90점 사이면 A학점
        //만약 score 값이 80~ 89점 사이면 B학점
        //만약 score 값이 70~ 79점 사이면 C학점
        //만약 score 값이 70 미만이면  D학점
        //만약 score 값이 100점을넘기거나 0점 아래면 "측정 불가"

        if (score < 0 || score > 100) {
            System.out.println("측정 불가");
        } else if (score >= 90) {
            System.out.println("A 학점");
            String result = "D";
        } else if (score >= 80) {
            System.out.println("B 학점");
        } else if (score >= 70) {
            System.out.println("C 학점");
        }
    }
    }