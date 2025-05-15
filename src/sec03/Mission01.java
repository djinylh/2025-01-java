package sec03;

public class Mission01 {
    public static void main(String[] args) {
        int month = (int)(Math.random() * 16.0 );// 0 ~15

        System.out.print("month: " + month);

        System.out.println();

        //switch를 이용하여 12,1,2는
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.print(month+ "월은" + " 겨울입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print(month+ "월은" + " 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print(month+ "월은" + " 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print(month+ "월은" + " 가을입니다.");
                break;
            default:
                System.out.print(month+ "월은" + " 해당 계절이 없습니다.");
                break;
        }
    }
}
