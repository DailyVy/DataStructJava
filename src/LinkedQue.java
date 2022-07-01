public class LinkedQue<T> {
    // front 가 null 이면 비어있다.
    // push 하면 rear의 next에 노드를 추가해주고 rear는 rear.next가 된다.
    // pop 하면 front의 next가 front가 된다. 만약 null 이면 empty이다. ==> 이 경우 rear도 null로 만들어준다.
    private class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // front는 첫번째 노드를 가리키고, rear은 마지막 노드를 가리킨다.
    private Node front;
    private Node rear;

    LinkedQue() {
        front = null;
        rear = null;
    }

    // 1. isEmpty()
    boolean isEmpty() {
        return (front == null);
    }
    // 2. isFull() : 구현 X

    // 3. push()
    // push 하면 rear의 next에 노드를 추가해주고 rear는 rear.next가 된다.
    void push(T item) {
        Node pushNode = new Node(item);

        if (isEmpty()) {
            front = pushNode;
            rear = pushNode;
        }
        else {
            rear.next = pushNode;
            rear = pushNode;
        }
    }

    // 4. pop()
    T pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        // pop 할 대는 front를 front의 next로 연결해야한다.
        // 그 전에 반환할 front.data를 임시로 저장해놓고 이걸 반환하자
        T retVal = front.data;
        front = front.next;

        // 만약 front.next가 null이면 empty! ==> rear도 empty로 바꿉시다.
        if (front == null) rear = null;

        return retVal;
    }

    // 5. peek()
    T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        return front.data;
    }

    // 6. delete()
    void delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        }
        else {
            front = front.next;
            // 여기도 front가 null값이면 empty니까 rear도 null로 바꿔주자
            if (front == null) rear = null;
        }
    }
}
