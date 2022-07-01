import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

// 2. Position 클래스 작성
class Position {
    int row;
    int col;

    Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class DFS0522 {
    // 1. dfs 함수 작성. 인자가 좀 많다.
    //  dfs(start행(i), start열(j), 2차원배열 input, 방문체크할 2차원배열 visit, 체크를 뭘로 칠한건지 n_group)
    static void dfs(int startRow, int startCol, int[][] input, int[][] visit, int n_group) {
        // visit와 input을 인자로 넘겨서 여기서 값을 바꾸면
        //  메인에서도 값이 바뀌게 된다. ==> 원본 바뀜
        //  2차원 배열이 복사되서 넘어가는 게 아니고 레퍼런스(주소)가 넘어가기 때문에!
        //  테스트 해봅시다.
        // visit[0][0] = 999;

        // 일단 위치를 집어 넣어야 한다.
        // 행과 열을 저장할 수 있는 위치를..!!
        // visit를 했을 때 (1,1)을 방문했는지, (2,1)을 방문했는지
        // 자바는 integer 두 개를 동시에 stack이든 queue든 넣는 방법이 없다.
        // 그래서 이 위치(행과 열)를 담을 수 있는 클래스를 만들 것
        // class Position 을 만들고 오세요.
        // Stack 에다 Position 자체를 집어넣을 것임

        // 3. Stack 을 만들거다. Position을 담을 수 있는 스택
        Stack<Position> stack = new Stack<>();
        // startRow랑 startCol 부터 시작한다.
        Position start = new Position(startRow, startCol);
        // 시작점을 stack에 push하고 시작
        stack.push(start); // 맨 처음에 (0, 1)을 집어넣고 시작

        // stack -> 방문하면 집어넣고(push) 얘를 빼면서(pop) 방문처리를 한다.
        //  이걸 언제까지 하냐면 stack이 empty가 될 때까지
        while (!stack.empty()) { // stack.empty() == false 와 같다.
            // 스택에서 하나 꺼낼 때 그 노드는 방문처리를 하고 연결된 노드가 있으면 스택에 넣는다.
            Position curPos = stack.pop();
            // 방문처리하고 연결된 노드가 있으면 넣는다.
            // visit[curPos.row][curPos.col] = n_group;
            int row = curPos.row;
            int col = curPos.col;
            visit[row][col] = n_group; // 방문 처리를 해줌

            // 연결된 노드가 있으면 넣는다 => 상하좌우 다 체크해야 함!
            // 상 : row - 1, col ==> row가 0보다 작아지면 안된다(out of range) ==> 예외처리
            if (row - 1 >= 0) {
                if (input[row-1][col] == 1 && visit[row-1][col] == 0) {
                    stack.push(new Position(row-1, col));
                }
            }
            // 하 : row + 1, col ==> row가 배열의 길이보다 크거나 같으면 안됨
            if (row + 1 < input.length) {
                if (input[row+1][col] == 1 && visit[row+1][col] == 0) {
                    stack.push(new Position(row+1, col));
                }
            }
            // 좌 : row, col - 1 ==> col - 1이 0보다 작아지면 안됨
            if (col - 1 >= 0) {
                if (input[row][col-1] == 1 && visit[row][col-1] == 0) {
                    stack.push(new Position(row, col-1));
                }
            }
            // 우 : row, col + 1 ==> col + 1이 배열의 한 행의 길이보다 크거나 같으면 안됨
            if (col + 1 < input[row].length) {
                if (input[row][col+1] == 1 && visit[row][col+1] == 0) {
                    stack.push(new Position(row, col+1));
                }
            }
        } // while 문의 끝
    }

    // 2. 각 단지의 수를 리턴하는 dfs함수 작성 ==> pop 을 몇번했는지 카운트 하면 된다.
    static int dfs2(int startRow, int startCol, int[][] input, int[][]visit, int n_group) {
        Stack<Position> stack = new Stack<>();
        Position start = new Position(startRow, startCol);

        stack.push(start); // 일단 시작지점 push

        int num = 0; // 단지의 수

        while(!stack.empty()) {
            Position curPos = stack.pop();

            int row = curPos.row;
            int col = curPos.col;

            // qna. pop하고 curPose의 row,col에 해당하는
            //  visit[row][col]에 방문처리가 안되어있다면 num을 늘린다.
            //  만약 그냥 count하면 stack에중복되어있는 걸 pop하면서 count하잖아.
            if(visit[row][col] == 0) num++;

            // todo. 방문 처리 꼭 해줘야한다.
            visit[row][col] = n_group;

            // 상하좌우 확인하고 집이 있고 방문을 안했으면 push
            // 상
            if (row - 1 >= 0) {
                if(input[row-1][col] == 1 && visit[row-1][col] == 0) {
                    stack.push(new Position(row-1, col));
                }
            }
            // 하
            if (row + 1 < input.length) {
                if (input[row+1][col] == 1 && visit[row+1][col] == 0) {
                    stack.push(new Position(row+1, col));
                }
            }
            // 좌
            if (col - 1 >= 0) {
                if(input[row][col-1] == 1 && visit[row][col-1] == 0) {
                    stack.push(new Position(row, col-1));
                }
            }
            if (col + 1 < input[row].length) {
                if(input[row][col+1] == 1 && visit[row][col+1] == 0) {
                    stack.push(new Position(row, col+1));
                }
            }

        }// while 문 끝

        return num;
    }


    public static void main(String[] args) {

        int mapSize = 7;
        int [][] input = {
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0}
        };

        // input이랑 똑같은 크기의 visit 배열 필요
        //  방문하지 않은 곳은 0, 방문한 곳은 1, 2, 3 ..
        int [][] visit = new int[mapSize][mapSize];
        // 채울 수 ==> 단지의 수
        int n_group = 0; // 1씩 증가시키면서 visit에 칠할 것이다.

        // 단지 수 카운트 배열 선언
        ArrayList<Integer> numHouse = new ArrayList<>();

        // i행, j열
        for (int i = 0; i < mapSize; ++i) {
            for (int j = 0; j < mapSize; ++j){
                // input[i][j]에 집이 있고, 방문하지 않았으면(visit[i][j]==0) 여기를 방문할 것이다.
                if (input[i][j]==1 && visit[i][j]==0){
                    System.out.println(i + " " + j + "에서 탐색 시작");
                    // 이제 dfs 함수 짜러 갑시다. main에서 만들거임 => static
//                    dfs(i, j, input, visit, ++n_group); // ++n_group 주의: 증가시켜주고 visit에 넣어야 해
                    int num = dfs2(i, j, input, visit, ++n_group);
                    numHouse.add(num);
                    System.out.println(n_group + "단지의 아파트 수는 " + num);
                }
            }
        }

        System.out.println(Arrays.deepToString(visit));
        System.out.println("visit 좀 예쁘게 봅시다");
        for (int i = 0; i < visit.length; ++i) {
            for (int j = 0; j < visit[i].length; ++j) {
                System.out.print("[" + visit[i][j] + "]");
            }
            System.out.println();
        }

        // numHouse를 봅시다.
        System.out.println(numHouse);
        // numHouse 오름차순 정렬
        numHouse.sort(Comparator.naturalOrder()); // 오름차순 정렬 위한 .sort(Comparator.naturalOrder())
        // 그리고 맨 처음 자리에 단지의 수를 넣어주자 ==> n_group
        numHouse.add(0, n_group);
        System.out.println(numHouse);

        // 2차원 배열을 함수 인자로 넣어줬을 때 레퍼런스가 넘어간다.
        // 이렇게 안하고 복사해서 넘어가면 메모리를 엄청 많이 사용하게 된다.
        // 그래서 함수에서 값을 바꾸면 메인에서도 그 배열의 값이 변함!
        // 그걸 테스트 하는 거야
        // System.out.println(Arrays.toString(visit)); // visit가 2차원 배열이라 toString하면 주소값이 나옴
        // 2차원 행렬 찍을 때 deepToString
        // dfs(0, 0, input, visit, n_group); // visit 값이 변한걸 보고싶으니까 dfs함수 호출
        // dfs함수에서 visit[0][0] = 999; 로 줬음
        // System.out.println(Arrays.deepToString(visit));

    }
}
