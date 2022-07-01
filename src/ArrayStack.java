public class ArrayStack<T> { // 스택에 어떤 자료가 들어갈 지 모름 => T 타입
    // stack에서는 뭐가 필요할까? --> 제일 위에있는 top!
    private int top; // 배열이 어디까지 차 있는지 확인 ==> 아무것도 없으면 -1, 다 차 있으면 n-1(사이즈가 n일때)
    private int stackSize; // 배열이기 때문에 size가 있다.
    private T [] stack;

    // 생성자
    // stackSize만큼의 Array를 만들거임
    ArrayStack(int stackSize) {
        top = -1; // 스택이 비어있음, 하나를 집어넣으면 0(제일 위에 차 있는 배열의 인덱스)
        this.stackSize = stackSize;
        // stackSize만큼의 배열을 생성합시다. Object배열 생성 후 T타입으로 캐스팅
        stack = (T[]) new Object[stackSize]; // 자바의 모든 객체는 object를 상속받은 것들임.
    }

    // 1. isEmpty() : 스택이 비어있으면 true
    boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }
    // 2. isFull() : 스택이 가득 차 있으면 false
    boolean isFull() {
        if (top == stackSize-1) return true;
        else return false;
    }
    // 3. push() : 새로운 원소를 삽입
    void push(T item) {
        // 1. 가득 차 있을 경우는 못 넣잖아...
        if (isFull()) {
            System.out.println("Stack is Full!");
        }
        // 2. 스택이 차 있지 않는 경우
        else {
            stack[++top] = item;
        }
    }
    // 4. pop() : 가장 위의 원소를 제거하고 반환
    T pop() {
        // 1. 스택이 비어있을 경우
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        }
        // 2. 스택이 비어있지 않을 경우, 가장 위의 원소를 제거 ==> top이겠지?
        return stack[top--]; // return 후 top을 하나 줄여줌
    }
    // 5. peek() : 가장 위의 원소를 반환하지만 삭제하지는 않음
    T peek() {
        // 1. 스택이 비어있을 경우
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return null;
        }
        // 2. 스택이 비어있지 않은 경우
        return stack[top];
    }
    // 6. delete() : 가장 위의 원소를 삭제, 반환은 X
    void delete() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        }
        else {
            stack[top--] = null; // 지우고 빼야 한다. --의 위치에 주의
        }
    }

}
