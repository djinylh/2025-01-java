package sec03;

public class SwitchStudy {
    public static void main(String[] args) {
        /*
        switch는 값이 맞는 case에서 부터 실행하고 bradk에서 멈춤
        * */
        int num = 5;

        switch (num) {
            case 1:
                System.out.println("1입니다.");
            case 2:
            case 3:
                System.out.println("2 or 3 입니다.");
                break;
            default:
                System.out.println("값이 없네요.");
                break;
            case 4:
                System.out.println("4입니다.");
                break;
        }
        System.out.println("-- 끝 -- ");
    }
}
