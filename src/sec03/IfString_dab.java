package sec03;

import java.util.Scanner;

public class IfString_dab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요. (W/M) > ");
        String gender = scanner.next();
        System.out.println();

        if ("W".equalsIgnoreCase(gender)||"여".equalsIgnoreCase(gender)) {
            System.out.println("당신은 여자입니다");
        }
        else if ("M".equalsIgnoreCase(gender)) {
                System.out.println("당신은 남자입니다");
            }
        else {
            System.out.println("성별을 다시 입력해주세요.");
        }
        System.out.println("--끝--");

    }
}
