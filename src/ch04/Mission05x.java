package ch04;

public class Mission05x {
    public static void main(String[] args) {
        int starCount = (int)(Math.random() * 6.0) + 2 ;
        for ( starCount = (int)(Math.random() * 6.0) + 1 ; starCount < 8 ; ++ starCount  ) {
            System.out.printf("*");

        }

    }
}





