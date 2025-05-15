package ch04.sec04;

public class Mission14 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 4;
        System.out.println("star: " + star);

        for (int i = 1; i <= star; i++) {
            int a = star - i;
            for (int k = 0; k < a ; k++) {
                System.out.print("_");
            }
            for(int f = 0; f < i ; f++){
                System.out.print("*");
            }
            //star = 4
            //___*
            //__**
            //_***
            //****
            //star = 5
            //_____*
            //___**
            //__***
            System.out.println();
        }
    }
}
