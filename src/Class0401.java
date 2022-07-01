class Person { // 실제로 메모리에 잡히지 않아. 코드로만 적혀 있을 뿐
    String name;
    int height;
    int weight;

    // 생성자 : 클래스 이름과 같아야 한다.
    Person() // 생성자는 호출을 따로 해주는 함수가 아니다. 굉장히 특별한 함수. 리턴 타입이 없다. 초기 인스턴스를 만들 때 자동으로 실행
    {
        name = "Choi Bygyeol";
        height = 180;
        weight = 75;
    }


    Person(String name, int height, int weight) // ()안의 얘네는 지역변수
    {
    // this 메서드 => 이건 잘 안쓴다.
    /*Person()
    {
        this("Yuna Kim", 165, 43);
    }*/

    // 메서드 만들기
        this.name = name; // 멤버 변수, 객체가 없어질 때 사라진다.
        this.height = height; // this.는 이 클래스가 가지고 있는 변수명 , 오른쪽에 있는 이름은 로컬변수, 인자로부터 넘어옴
        this.weight = weight;
    }
    void sayHello()
    {
        System.out.println("Hello, I am " + this.name);
    }
}

public class Class0401 {
    public static void main(String[] args) {

        // 인자가 없는 constructor
//        Person person = new Person(); // Person 클래스의 person 인스턴스(객체) 생성, 이 때 메모리에 생긴다.
//        System.out.println(person.name + "의 키는 " + person.height + "cm 입니다.");

        // 인자가 있는 constructor
        Person p2 = new Person("Yeonkoung Kim", 192, 72);
        System.out.println(p2.name + "의 키는 " + p2.height + "cm 입니다.");
        p2.sayHello();

        // this 메서드
        Person p3 = new Person();
        System.out.println(p3.name + "의 키는 " + p3.height + "cm 입니다.");
        p3.sayHello();

    }
}
