import java.sql.SQLOutput;
import java.util.Scanner; // Scanner 클래스를 사용하기 위해 추가

public class Python300Java {
    public static void main(String[] args) {
/************************************파이썬 300제 풀어보기*********************************************/
/************************************ 101 ~ 130 (조건문)*********************************************/
/************************************ 131 ~ 200 (반복문)*********************************************/
        // 101
        //boolean

        //102
        System.out.println(3 == 5); //false

        //103
        System.out.println(3 < 5); // true

        //104
        int x = 4;
        System.out.println(1 < x && x < 5); //true, 1 < x < 5 는 안되는건가?

        //105
        System.out.println(3==3 && 4!=3); // true

        //106
        System.out.println(3>=4); // => 는 illegal expression

        //107
        if (3 < 4) System.out.println("Hello World");

        //108
        if (4 < 3) System.out.println("Hello World");
        else System.out.println("Hi, there.");

        //109
        System.out.println("======109=====");
        if (true)
        {
            System.out.println("1");
            System.out.println("2");
        }
        else System.out.println("3");
        System.out.println("4");

        //110
        System.out.println("======110=====");
        if (true)
            if (false)
            {
                System.out.println("1");
                System.out.println("2");
            }
            else System.out.println("3");
        else System.out.println("4");
        System.out.println("5");

        //111
        Scanner scanner = new Scanner(System.in); // Scanner클래스의 객체 생성
//        String input = scanner.nextLine(); // 입력받은 내용을 input에 저장, 안녕하세요
//        System.out.println(input + input); // 안녕하세요안녕하세요

        //112
//        System.out.print("숫자를 입력하세요: ");
//        String input_str = scanner.nextLine(); // 111번에서 이미 Scanner 클래스의 객체 생성 했으니 nextLine 메소드 입력
//        int input_int = Integer.parseInt(input_str);
//        System.out.println(input_int + 10);

        //113
//        System.out.print("자연수 하나를 입력하세요, 홀수/짝수 판별: ");
//        String od_ev = scanner.nextLine();
//        int odd_even = Integer.parseInt(od_ev);
//        if (odd_even % 2 != 0) System.out.printf("%d는 홀수입니다.", odd_even);
//        else System.out.printf("%d는 짝수입니다.", odd_even);

        //114
//        System.out.print("입력값: ");
//        String input_str = scanner.nextLine();
//        int input_num = Integer.parseInt(input_str);
//        if (input_num + 20 > 255) System.out.println("출력값: 255");
//        else System.out.printf("출력값: %d",input_num + 20);

        //115
//        System.out.print("입력값: ");
//        String input_str = scanner.nextLine();
//        int input_num = Integer.parseInt(input_str);
//        if (input_num - 20 < 0) System.out.println("출력값: 0");
//        else System.out.printf("출력값: %d", input_num - 20);

        //116
        System.out.print("현재시간(00:00 형태로 입력하세요): ");
        String input_time = scanner.nextLine();
        String[] hour_min = input_time.split(":");
        System.out.println(hour_min[0]);
        System.out.println(hour_min[1]);
        if (hour_min[1].equals("00")) System.out.println("정각입니다."); // 문자열 비교는 .equals() 사용!
        else System.out.println("정각이 아닙니다.");

    }
}
