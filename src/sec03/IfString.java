package sec03;

import java.util.Scanner;

public class IfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요. (W/M) > ");
        String gender = scanner.next();
        System.out.println();

        String gender1 = "W";
                String gender2 = new String("W");

                if (gender1.equals("W")){
                    System.out.println("당신은 여자입니다.");
                }
                else {
                    System.out.println("당신은 남자입니다");
                }

    }
}
