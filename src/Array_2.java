public class Array_2 {
    public static void main(String[] args) {

//        int row = 2, col = 3;
//
//        int [][] arr_2 = new int[row][col];
//
//        arr_2[0][0] = 11;
//        arr_2[0][1] = 12;
//        arr_2[0][2] = 13;
//        arr_2[1][0] = 21;
//        arr_2[1][1] = 22;
//        arr_2[1][2] = 23;
//
//        for (int i = 0; i < row; ++i)
//        {
//            for (int j = 0 ; j < col; ++j)
//            {
//                System.out.printf("[%d]", arr_2[i][j]);
//            }
//            System.out.printf("\n"); // 행을 나누기 위해 엔터 입력!
//        }
/******************************************구구단 만들기**********************************************/

        int row = 10, col = 10; // 인덱스는 0~9 니까 10으로 해야 9단을 만들 수 있다.

        int [][] gugu_arr = new int[row][col];

        for (int i = 2; i < row; ++i) // 2단부터
        {
            System.out.printf("=== %d단 === \n", i);
            for (int j = 1; j < col; ++j) // i*1 ~ i*9 까지
            {
                gugu_arr[i][j] = i * j;
                System.out.printf("%d x %d = %d\n", i, j, gugu_arr[i][j]);
            }
            System.out.println("\n");
        }

    }
}
