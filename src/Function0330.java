import java.util.Scanner;

public class Function0330 {
//    int increaseFive (int a)
//    {
//        a += 5; // a = a + 5 랑 결과는 같지만 더 빠르다.
//        return a;
//    }

    // 평균 구하는 함수 만들어보자. 성적을 배열로 입력 받아 평균을 리턴하는 함수를 작성하시오
    double avr (int[] score) // score란 이름의 배열을 받은거야, 뭘 받았든 이건 score야
    {
        // 평균은 어떻게 구하나요? 다 더해서 / 갯수
        // 배열의 합을 구해야해

        // 패턴이니 외우세요
        int sum = 0; // 합을 계산할 변수를 하나 만들어

        for(int i = 0; i < score.length; ++i) // score.length : 배열의 길이
        {
            sum += score[i];
        }
        //합을 개수로 나누면 평균
        double avr = (double)sum / score.length; // 캐스팅을 해야 avr가 double이 됩니다.

        return avr;
    }

    public static void main(String[] args) {
//        Function0330 obj = new Function0330();
//        int a = 3;
//        a = obj.increaseFive(a);
//        System.out.println(a);
        Function0330 obj = new Function0330();
        int [] std1_score = {100, 95, 90};
        double avr = obj.avr(std1_score);
        System.out.println(avr);

    }
}
