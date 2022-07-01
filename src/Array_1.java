public class Array_1 {
    public static void main(String[] args) {
        int [] array_test; // 배열 선언

        array_test = new int[5]; //메모리 공간 할당

        // int [] test_array = new int[5]; 한 줄로 해도 상관없음

//        array_test[0] = 1; // 할당안했으면 0 임, int의 초기값은 0이라고 생각해
        array_test[1] = 2;
        array_test[2] = 3;
        array_test[3] = 4;
        array_test[4] = 5;
//        int a; // 얘는 할당 안하면 값도 없다

        System.out.println("array_test[0]="+ array_test[0]);
        System.out.println("array_test[1]="+ array_test[1]);
        System.out.println("array_test[2]="+ array_test[2]);
        System.out.println("array_test[3]="+ array_test[3]);
        System.out.println("array_test[4]="+ array_test[4]);

    }
}
