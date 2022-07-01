public class Func0330_practice {

    int max(int[] score)
    {
        int max = 0;

        for (int i=0; i<score.length; ++i)
        {
            if (max < score[i])
            {
                max = score[i];
            }
        }
        return max;
    }

    int max_index(int[] score)
    {
        int max = 0;
        int maxIndex = 0;

        for (int i=0; i<score.length; ++i)
        {
            if (max < score[i])
            {
                max = score[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Func0330_practice obj = new Func0330_practice(); // 객체 생성

        int [] score = {75, 80, 100};

        int max_grade = obj.max(score); // 함수 호출
        int max_index = obj.max_index(score);
        System.out.println(max_grade);
        System.out.println(max_index);
    }
}
