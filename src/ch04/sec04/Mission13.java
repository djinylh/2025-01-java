package ch04.sec04;

public class Mission13 {
    public static void main(String[] args) {
        int star = (int)(Math.random() *6.0 ) +3; // 3~8
        System.out.println("star: " + star);

        for ( int i = 1 ; i <= star ; i++) {

            for ( int k = 0 ; k  < i  ; k++  ) {
                System.out.print("*");
            }
            System.out.println();
        }
        // star = 3
        //*
        // *
        // ***

    }
}
