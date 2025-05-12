package ch04;

public class Mssion04
{
    public static void main (String[] args)
    {
     int score = (int)(Math.random() * 201.0);

     // 00 ~ 200사이의 랜덤값

        //만약 score 값이 100~ 90점 사이면 A학점
        //만약 score 값이 80~ 89점 사이면 B학점
        //만약 score 값이 70~ 79점 사이면 C학점
        //만약 score 값이 70 미만이면  D학점
        //만약 score 값이 100점을넘기거나 0점 아래면 "측정 불가"
        if (score <= 0 ) {
            System.out.println("측정불가");
        }
        else if (score <= 70) {

            System.out.println("D 학점"); }

        else if (score <= 80) {

            System.out.println("C 학점"); }

        else if (score <= 90) {

            System.out.println("B 학점"); }

        else if (score <= 100) {

            System.out.println("A 학점"); }

        else {
            System.out.println("측정 불가");
        }




        System.out.println("-- 끝 --");



    }
}
