public class ArrayCQue<T> {
    // enQueue(push)시 rear을 1 증가시키고 집어넣는다.
    // deQueue(pop)시 front를 1 증가시키고 뺀다. front는 항상 비어있다.
    // Circular 로 구현한다. front == rear 이지만 rear == n-1일 경우 비어있지만 포화상태로 인식하므로
    // front == rear 라는 것은 Queue가 비어있다는 뜻
    // rear + 1 == front 라면 꽉 찼다!
    // 배열의 크기만큼 모듈러스 연산 ==> 이게 새로운 인덱스가 된다.
    // 공백 상태와 포화 상태 구분을 쉽게 하기 위해서 front가 있는 자리는 사용하지 않고 항상 빈자리로 둔다.

    // queue는 front, rear 필요
    // 배열이니까 size 필요, T타입으로된 배열 필요
    private int front;
    private int rear;
    private int queSize;
    private T[] queue;

    // 1. 생성자
    ArrayCQue() {
        front = 0;
        rear = 0;
        queSize = 5; // queSize가 5라면 실제로 front는 비어있으니까 queue에는 4개의 value가 들어간다.
        queue = (T[]) new Object[queSize];
    }

    // 2. isEmpty() : 큐가 비어있으면 true
    // front == rear 라면 비어있쥬
    boolean isEmpty() {
        // if - else 라고 작성해도 되지만 요렇게 짜보았다.
        return (front == rear);
    }

    // 3. isFull() : 큐가 가득 차있으면 true
    // front == rear + 1 이라면 가득 차 있음
    // 그런데 circular 잖아??? rear + 1 을 queSize로 모듈러스 연산한 값과 front와 같아야 ㅎ나다.
    boolean isFull() {
        return (((rear + 1) % queSize) == front);
    }

    // 4. push()
    void push(T item) {
        if (isFull()) {
            System.out.println("Queue is Full!");
        }
        else {
            // rear를 하나 증가시키고 넣어준다.
            // 그런데 배열이 끝까지 간다면 다시 앞으로 돌아와야 하니까 모듈러스 연산!
            rear = (rear + 1) % queSize;
            queue[rear] = item;
        }
    }

    // 5. pop() : 선입선출이다!!! FIFO
    // front를 1 증가 시키고 반환한다. front는 항상 비어있다.
    T pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        front = (front + 1) % queSize;
        System.out.println("front = " + front + " , rear = " + rear); // 디버깅
        return queue[front];
    }


    // 6. peek() : front 증가는 필요없다.
    T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        return queue[(front + 1) % queSize]; // front + 1하면 인덱스 넘어갈 수 있으니까~
    }


    // 7. delete() : 삭제
    void delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        }
        else {
            front = (front + 1) % queSize;
        }
    }

}
