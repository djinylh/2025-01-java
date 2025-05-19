package ch04.sec07;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        int sum1 = 0;

        while (b) {
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택 >");
            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    System.out.print(" 예금액 > ");
                    a = scanner.nextInt();
                    sum1 = sum1 +a;
                    System.out.printf("잔고 : %,d\n",sum1);
                    break;

                case 2:
                    System.out.print(" 출금액 > ");
                    a = scanner.nextInt();
                    if ( a > sum1) {
                        System.out.println("잔액이 부족합니다");
                    } else {
                        sum1 = sum1 - a;
                        System.out.printf("잔고 : %,d\n", sum1);
                    }
                    break;

                case 3:
                    System.out.printf("잔고 : %,d\n", sum1);
                    break;

                case 4:
                    b = false;
                    System.out.print("프로그램 종료");
                    break;
                default:
                    System.out.println("1~4번까지 입력해 주세요");
            }

        }
    }
}
