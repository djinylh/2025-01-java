package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요");
boolean p = true;
int num1 = 0;
while (p){
    System.out.print(">>");
    int num2 = scanner.nextInt();
if (num2==0) {
    p = false;}
else {
    num1 = num1 + num2;
}

    System.out.printf("현재 합계: %,d\n",num1);
    }

    }
}

