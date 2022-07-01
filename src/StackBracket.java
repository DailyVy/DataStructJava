import java.util.EmptyStackException;
import java.util.Stack;

public class StackBracket {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // 확인할 괄호
        String inputString = "()()((()))";
        // 몇 번째 open괄호인가
        int n = 3;
        // 정답을 내야한당
        int ans = 0; // 짝이 안맞거나 그러면 0을 리턴할거야

        // Stack이 필요하다 ==> integer stack이 필요함
        Stack<Integer> stack = new Stack<>();
        // charAt(i) 말고 다른 걸 써봅시당당
        char[] inputArray = inputString.toCharArray(); // inputString을 char 배열로 바꿔줌

        int count = 0; // 열린괄호 count

        // 예외 발생할 수 있는 상황을 try문에 집어 넣는다.
        // 어떤 예외가 발생할까? -> 스택에서 pop을 했을 때 비어있음
        try {
            for (int i = 0; i < inputArray.length; ++i) {
                // 열린괄호 나오면 push, 닫힌괄호 나오면 pop
                if (inputArray[i] == '(') {
                    stack.push(++count); // count를 넣는데 1 증가시켜서 넣어야한다.
                }
                else if (inputArray[i] == ')') {
                    int temp = stack.pop(); // integer를 넣어놨으니 꺼내봅시다.
                    // 이 꺼낸게 n이랑 같이면 우리가 찾는 열린괄호~
                    if (temp == n) {
                        ans = i + 1; // 인덱스는 0부터 시작하고 우리는 몇번째인건지 알고싶은거다.
                    }
                }
            }
        }
        // catch에서 예외처리
        catch (EmptyStackException e){
            ans = 0;
        }
        // 예외가 발생하든 발생하지 않든 finally는 돈당
        finally {
            // stack size가 0이상이면 stack에 남아있다는 소리니까... 짝이 안맞다는 소리...!
            if (stack.size() > 0) ans = 0;
        }

        System.out.println("Answer = " + ans);

    }
}
