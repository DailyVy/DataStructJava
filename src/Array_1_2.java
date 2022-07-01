public class Array_1_2 {

    public static void main(String[] args) {
//        int [] test_array; // 배열 선언
//
//        test_array = new int[5]; //메모리 공간 할당 new라는 연산자로!!! 데이터가 저장될 메모리 생성작업
//
//        // int [] test_array = new int[5]; 한 줄로 해도 상관없음
//
//        test_array[0] = 1; // 할당안했으면 0 임, int의 초기값은 0이라고 생각해
//        test_array[1] = 2;
//        test_array[2] = 3;
//        test_array[3] = test_array[0] + test_array[2];
//        test_array[4] = test_array[1] + test_array[3];
//
//        System.out.println("test_array[0]="+ test_array[0]);
//        System.out.println("test_array[1]="+ test_array[1]);
//        System.out.println("test_array[2]="+ test_array[2]);
//        System.out.println("test_array[3]="+ test_array[3]);
//        System.out.println("test_array[4]="+ test_array[4]);
//
///*
//********************************하지만 위와 같이 나열하는 건 보기 좋지 않아!! *****************************
//***********************그러니까 for 문을 이용해서 해봅시다. for (초기화;조건문;증감식) ********************
// */
//
//        int [] gugudan_array = new int[9];
//
//        int dan = 3;
//
//        for (int i = 0; i < 9 ; ++i){
//            // 배열이 0번부터(인덱스) 시작하니까 i는 0으로 선언
//            // 여기서 바로 시스템 출력해도 되는데 왜 안해놨을까? i 때문이다.
//            // 같은 범위에서는 같은 이름을 사용할 수 없기 때문이라는뎅...?
//            gugudan_array[i] = dan * (i+1);
//        }
//
//        for (int i = 0; i < 9; ++i){
////            System.out.println(dan + " * " + ( i + 1 ) + " = " + gugudan_array[i]);
//            // 위는 아래와 같은 코드이다. 하지만 값이 문자로 바껴서 출력이 된다.더하기로 문자끼리 더해서..
//            System.out.printf("%d * %d = %d\n", dan, i+1, gugudan_array[i]); // 이게 더 깔끔
//        }
////        gugudan_array[0] = dan * 1; // 1은 곱해봤자 1인데 왜 곱하냐고 그냥 알려주는 의미로 노란색 표시~

        /*
         ******************************** 다음 시간에 할 거 이중 for문 : 일단 해보기 *****************************
         ************************************* 구구단 전체 출력해봅시다. ********************************
         */


        int [][] total_gu_array = new int[8][9];

        for (int i = 0; i < 8; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                total_gu_array[i][j] = (i+2) * (j+1);
                System.out.printf("%d * %d = %d\n", i+2, j+1,total_gu_array[i][j]);
            }
            System.out.println("\n");
        }
    }
}
