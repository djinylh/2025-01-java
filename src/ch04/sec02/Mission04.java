package ch04.sec02;

public class Mission04
{
    public static void main(String[] args)
    {
    // value = 5 라면 출력: 5는 홀수입니다
    // 랜덤값이 value 97라면 97은 홀수입니다
    // 랜덤앖이 54라면 54는 짝수입니다

    int value = (int)(Math.random()*100) + 1;
    if (value % 2 == 0)
        {
        System.out.println(value + "는(은)" + " 짝수입니다.");
        }
    else{
            System.out.println(value + "는(은)" + " 홀수입니다.");
        }
    }
}

