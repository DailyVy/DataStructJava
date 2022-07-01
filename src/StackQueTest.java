import java.util.Arrays;

public class StackQueTest {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // ArrayStack 테스트
        /*ArrayStack <String> stack = new ArrayStack(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        // push 테스트
        stack.push("파스타");
        stack.push("치킨");
        stack.push("샐러드");
        stack.push("망고");
        stack.push("메론");
//        stack.push("카프레제"); // Stack is Full

        // pop 테스트
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop()); // Stack is Empty, null

        // delete 와 peek 테스트
        stack.delete();
        System.out.println(stack.peek());


        // LinkedStack 테스트
        LinkedStack <String> lstack = new LinkedStack<>();
        System.out.println(lstack.isEmpty());

        lstack.push("사과");
        lstack.push("바나나");
        lstack.push("딸기");
        lstack.push("체리");

        System.out.println(lstack.pop());
        lstack.delete();
        System.out.println(lstack.peek());*/

        // ArrayCQue 테스트
        ArrayCQue<String> myque = new ArrayCQue<>();

        myque.push("스위스");
        myque.push("이탈리아");
        myque.push("영국");
        myque.push("프랑스");
//        myque.push("스페인"); // 이거하면 Queue is Full! 나와야해 => front 는 비워두기로 했으니까!

        System.out.println(myque.pop()); // FIFO니까 스위스가 나와야해!
        myque.delete(); // 이탈리아가 삭제되겠지
        System.out.println(myque.peek()); // 영국이 튀어나오겠지 뭐

        // LinkedQue 테스트
        LinkedQue<String> que = new LinkedQue<>();
        System.out.println(que.isEmpty());

        que.push("HTML");
        que.push("Machine Learning");
        que.push("Python");
        que.push("Java");
        System.out.println(que.pop()); // HTML
        System.out.println(que.peek()); // Machine Learning
        que.delete(); // Machine Learning 지움
        System.out.println(que.pop()); // Python
    }
}
