package ch02;

public class PrintvsPrintln {
    public static void main(String[] args) {
        //print
        System.out.print("안녕");
        System.out.print("안녕   ");
        System.out.print("안녕");

        System.out.println("----------------");


        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");


        System.out.println("----------------");



        //printf
        int age = 22;
        String name = "홍길동";
        float height = 172.5f;
        System.out.println("제 이름은 " + name + "이고" + " 나이는 " + age + "살이며 " + "키는 " + height + "cm입니다.");
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm입니다.\n", name, age, height);

    }
}