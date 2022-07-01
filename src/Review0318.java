public class Review0318 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int samsung = 50_000;
        int n_samsung = 10;
        int sum = samsung * n_samsung;

        int market_cap = 298; // market c
        int current_sam = 50_000;
        float pER_sam = 15.79f;

        System.out.printf("삼성전자 총 평가 금액은 %,d원 입니다.\n", sum);
        System.out.printf("삼성전자 시가 총액은 %d조원, 현재가는 %,d원, PER은 %.2f입니다.\n", market_cap, current_sam, pER_sam);

        String n_bass = "180";
        String n_salmon = "170";

        System.out.println(n_bass + n_salmon); // 180170

        String s = "hello";
        String t = "Java";

        System.out.println(s + "! " + t); // 참고로 println 에는 문자열이 반드시 하나가 들어가야해!
        System.out.printf("%s! %s", s, t);

        String num_str = "720";
        String num_one_str = "1";

        int num_int = Integer.parseInt(num_str);
        int num_one_int = Integer.parseInt(num_one_str);

        System.out.println(num_str + num_one_str); // 7201
        System.out.println(num_int + num_one_int); // 721

        String numf_str = "3.1415926535";
        double numf_double = Double.parseDouble(numf_str);
        System.out.printf("원주율은 %.2f 입니다.\n", numf_double);

        int air_con = 48584;
        int months = 36;

        System.out.printf("에어컨이 월 %,d원에 무이자 %d개월의 조건으로 홈쇼핑에서 판매되고 있습니다.\n", air_con, months);
        System.out.printf("총 지불할 금액은 %,d원입니다.", air_con * months);
    }
}
