enum Week {MON, TUE, WED, THU, FRI, SAT, SUN}

enum FishType {Salmon, Bass}

public class Enum_1 {
    public static void main(String[] args) {

        Week today_1 = Week.FRI; // 열거 타입 변수 선언해서 값을 넣어주면 돼~ 변수 이름이 today

        if (today_1 == Week.FRI) {
            System.out.printf("%s에는 청소를 합니다.\n", today_1);
        }

        today_1 = Week.SAT; // Week 에 정의되지 않은 값을 넣으면 Error
        if (today_1 == Week.SAT) {
            System.out.printf("%s에는 청소를 안합니다.\n", today_1);
        }
/******************************문자열로 enum 타입 변수 생성 가능**********************************/
        // Enum변수명.valueOf : String을 주면 매칭되는 타입을 enum타입으로 돌려줌
        FishType myFish = FishType.valueOf("Salmon"); // FishType.Salmon

//        if (myFish == FishType.Bass)
//        {
//
//        }
//        else if (myFish == FishType.Salmon)
//        {
//
//        }
/******************************enum 타입을 쓰지 않았을 때**********************************/

        String mystrFish = "Salmon";

        // mystrFish.equals("Salmon")
        if (mystrFish == "Salmon")
        {
            System.out.println(mystrFish + "입니다.");
        }
/***************************************새로운 문법 Switch/Case ************************************/
//        Week today = Week.MON;
//
//        switch (today) // 변수 : 비교할 변수 이름 써줍니다!!! int든 String이든 상관 없음
//        {
//            case MON: // 세미콜론 아니고 콜론!
//                System.out.println("today는 MON입니다.");
//                break; // 브레이크 없으면 다음 케이스를 또 비교 합니다.
//            case TUE:
//                System.out.println("today는 TUE입니다.");
//                break;
//            case WED:
//                System.out.println("today는 WED입니다.");
//                break;
//            default: // 우리가 처리할 수 없는 값이 들어오면 default로 처리한다!! else와도 같음
//                System.out.println("case에 없는 숫자입니다.");
//                break;
//       }
/**********************************조건이 여러 개일 때, OR, AND, XOR ************************************/

        int num = 0; //

        if (num == 0 || num == 1 || num == 2) // OR : 조건이 3개! OR로 비교할 때
        {
            System.out.println("num이 0 or 1 or 2입니다.");
        }

        if (num == 0 && num == 1 && num == 2) // AND : 있을 수 없는 코드이긴 함
        {
            System.out.println("num이 0 or 1 or 2입니다.");
        }

        int gender = 0;
        int height = 170;

        if ((gender == 0 && height >= 170) || (gender == 1 && height >= 160)) {
            System.out.println("남자입니다?");
        }
/***********************************Switch/Case OR연결 - 잘 안 씀************************************/
        int num_2 = 0;

        switch (num_2) // 변수 : 비교할 변수 이름 써줍니다!!! int든 String이든 상관 없음
        {
            case 0: // switch를 OR로 연결할 때, 근데 이렇게 안 써
            case 1:
            case 2:
                System.out.println("num_2는 0또는 1또는 2입니다.");
                break;
            default: // 우리가 처리할 수 없는 값이 들어오면 default로 처리한다!! else와도 같음
                System.out.println("case에 없는 숫자입니다.");
                break;
        }
/**********************************물고기 타입을 enum형으로!***********************************/

    }
}

