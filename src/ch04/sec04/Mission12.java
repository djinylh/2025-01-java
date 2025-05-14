package ch04.sec04;

public class Mission12 {
    public static void main(String[] args) {
        /*
        2 x 1 = 2 \t 3 x 1 = 3 \t 4 x 1 = 4 ....
         */

        for (int dan = 1; dan < 10; dan++) {
            for (int i = 2; i < 10; i++) {

                System.out.print( i + " x " + dan + " = " + (dan * i)+"\t");

            }
            System.out.println();
        }
    }
}
