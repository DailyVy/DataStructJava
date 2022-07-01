public class Func0401 {
    // Func0330_practice  답안
    int maxVal(int [] arr)
    {
        int maxVal = arr[0]; // maxVal의 값을 배열의 제일 처음 값으로 초기화
        for(int i=1; i<arr.length; i++) // 이미 arr[0]은 maxVal에 들어가 있으니 [1]부터 비교
        {
            if (maxVal < arr[i])
            {
                    maxVal = arr[i];
            }
        }
        return maxVal;
    }
    int argmax(int [] arr) // 보통 index max구할 때는 저른 이름으로 써
    {
        int maxVal = arr[0]; // maxVal의 값을 배열의 제일 처음 값으로 초기화
        int maxIndex = 0;

        for(int i=1; i<arr.length; i++) // 이미 arr[0]은 maxVal에 들어가 있으니 [1]부터 비교
        {
            if (maxVal < arr[i])
            {
                maxVal = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // 심화문자 argmax함수 이용해서 배열을 정렬하는 함수 작성 (정렬 알고리즘)

    public static void main(String[] args) {
        Func0401 obj = new Func0401(); // 객체 생성

        int [] std1_score = {80, 95, 90, 98, 75};

        int maxResult = obj.maxVal(std1_score); // 함수 호출, 인자타입과 리턴타입을 맞게 매칭
        int indexMax = obj.argmax(std1_score);
        System.out.println(maxResult);
        System.out.println(indexMax);

    }
}
