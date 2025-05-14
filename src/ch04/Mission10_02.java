package ch04;

public class Mission10_02 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4.0 ) + 3 ; //  3~ 6
        System.out.printf("star: %d\n", star);
            int result = star * star;
            for (int k = 1; k <= result; k++) {
                System.out.print("*");
                if( k % star == 0 ) {
                    System.out.println();
                }
            }
        }
        /*
        star : 3
        ***
        ***
        ***
        star : 5
        *****
        *****
        *****
         */



    }
