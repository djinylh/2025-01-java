package ch04;

public class Mission05 {
    public static void main(String[] args) {
        int starCount = (int)(Math.random() * 6.0) + 2 ; // (1) 2~7사이 랜덤값
        System.out.printf("starCount: %d\n", starCount);

        //starcount = 3;
        //***

        //starCount = 7;
        //*******
        if ( starCount < 3) {
            System.out.println("**");
        }
        else if ( starCount <4 ) {
            System.out.println("***");
        }
        else if ( starCount <5) {
            System.out.println("****");
        }
        else if ( starCount <6) {
            System.out.println("*****");
        }
        else if ( starCount <7) {
            System.out.println("******");
        }
        else if ( starCount <8){
            System.out.println("*******");
        }
        else {
            System.out.println("**");
        }
    }
}


