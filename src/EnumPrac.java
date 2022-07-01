import java.util.Scanner;

enum Week2 {MON, TUE, WED, THU, FRI, SAT, SUN}
enum Fish {Salmon, Bass}

public class EnumPrac {
    public static void main(String[] args) {
        // practice
        Week2 today = Week2.valueOf("FRI"); // String으로 주는게 왜 중요할까? 데이터들이 웬만하면 다 String이기 때문
        Week2 tomorrow = Week2.SAT;
        System.out.println(today);
        System.out.println(tomorrow);

        Fish fishtype1 = Fish.valueOf("Salmon");
        Fish fishtype2 = Fish.valueOf("Bass");
        System.out.println(fishtype1 + " " + fishtype2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Salmon? Bass? Choose one! >>> ");
        String inputStr = scanner.nextLine();

        if (fishtype1 == Fish.valueOf(inputStr)) {
            System.out.println("연어가 좋아");
        }
        else if (fishtype2 == Fish.valueOf(inputStr)) {
            System.out.println("농어가 좋아 ");
        }
        else {
            System.out.println("연어도 농어도 아니야");
        }
        scanner.close();
    }
}
