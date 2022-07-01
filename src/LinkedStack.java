public class LinkedStack<T> {
    private class Node {
        T data;
        Node next;
        // Node의 생성자
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // 스택의 원소 : 단순 연결 리스트의 노드
    //  스택 원소의 순서 : 노드의 링크 포인터로 연결
    //  push : 리스트의 마지막에 노드 삽입
    //  pop : 리스트의 마지막 노드 삭제
    // 변수 top : 단순 연결 리스트의 마지막 노드를 가리키는 포인터 변수
    //  초기상태 : top = nul;;

    // LinkedStack에서 알고있어야 하는 건 하나밖에 없음
    // 바로 노드 top!
    private Node top;

    // 생성자를 만듭시다.
    LinkedStack() {
        top = null;
    }

    // 1. isEmpty()
    boolean isEmpty() {
        if (top == null) return true;
        else return false;
    }

    // 2. isFull() ==> 없다!!! 연결 자료형이기 때문에

    // 3. push()
    void push(T item) {
        Node pushNode = new Node(item);
        pushNode.next = top; // 어차피 pushNode의 next는 null일거 아냐
        top = pushNode; // top 은 pushNode를 가리킴
    }

    // 4. pop() : 가장 위의 원소를 제거하고 반환
    T pop() {
        // 1. 예외처리
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        }
        T retVal = top.data;
        top = top.next;
        return retVal;
    }

    // 5. peek()
    T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        }
        return top.data;
    }

    // 6. delete() : 가장 위의 원소를 삭제
    void delete() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        }
        else {
            top = top.next;
        }
    }

}
