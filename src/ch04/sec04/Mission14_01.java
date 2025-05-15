package ch04.sec04;

public class Mission14_01 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 4;
        System.out.println("star: " + star);

        for(int i = star; i>0; i--) {
            for(int k=1; k <= star; k++) {
                System.out.print(k < i ? "_" : "*" );
            }
            System.out.println();
        }
    }
}
