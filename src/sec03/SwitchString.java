package sec03;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요. (W/M) > ");
        String gender = scanner.next();
        System.out.println();
        System.out.println("gender " + gender);

        switch (gender) {
            case "W":
            case "w":
            case "여자":
            case "여":
                System.out.println("당신은 여자입니다");
                break;
            case "m":
            case "M":
            case "남자":
            case "남":
                System.out.println("당신은 남자입니다.");
                break;
            default:
                System.out.println("성별을 다시 입력해주세요.");
                break;


        }
        scanner.close();
    }
}
