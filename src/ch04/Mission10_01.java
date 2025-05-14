package ch04;

public class Mission10_01 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4.0 ) + 3 ; //  3~ 6
        System.out.printf("star: %d\n", star);


            for (int k = 0; k < star; k++) {
                if (star < 2){
                    System.out.print("*");
                }
                else if (star < 3){
                    System.out.print("**");
                }
                else if (star < 4){
                    System.out.print("***");
                }
                else if (star < 5){
                    System.out.print("****");
                }
                else if (star < 6){
                    System.out.print("*****");
                }
                else{
                    System.out.print("******");
                }
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

