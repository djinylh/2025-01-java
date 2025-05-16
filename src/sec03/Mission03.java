package sec03;

import java.util.Scanner;
public class Mission03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해 주세요 > ");
       int score = scanner.nextInt(); //-10 0 120

        if ( score < 0){
            System.out.println("잘 못된 점수 입니다.");
        }
        else if ( score < 70) {
            System.out.println("D");
        }   else if ( score < 74){
            System.out.println("C-");
        }        else if ( score < 78){
            System.out.println("C0");
        }        else if ( score < 80){
            System.out.println("C+");
        }        else if ( score < 84){
            System.out.println("B-");
        }        else if ( score < 88){
            System.out.println("B0");
        }        else if ( score < 94){
            System.out.println("A-");
        }        else if (score < 98){
            System.out.println("A0");
        }       else if (score <= 100){
            System.out.println("A+");
        }
        else {
            System.out.println("잘 못된 점수 입니다.");
        }
    }
}
