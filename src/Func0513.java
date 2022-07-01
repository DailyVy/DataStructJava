import java.util.Arrays;

public class Func0513 {
    int maxReturn(int [] intArray){
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]){
                max = intArray[i];
            }
        }
        return max;
    }

    int argmax(int [] intArray) {
        int max = intArray[0];
        int maxIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    // sortingArray에서 사용하기 위한 argmax 재정의
    // 인덱스를 받아 그 인덱스부터 배열의 최대값을 찾을 것임
    int argmax(int index, int [] intArray) {
        int max = intArray[index];
        int maxIndex = index;
        for (int i = index; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    int[] sortingArray(int [] intArray) { // 내림차순 정렬
        // intArray복사 ==> 함수 실행시키면 intArray가 바뀌더라고 그거 방지하려고
        int [] intArrayCopy = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++){
            intArrayCopy[i] = intArray[i];
        }
        // 정렬된 값을 저장시키기 위한 배열 생성
        int [] sortedArray = new int[intArrayCopy.length];

        int maxIndex; // 가장 큰값의 인덱스

        for(int i = 0; i < intArrayCopy.length; i++) {
            int temp = intArrayCopy[i]; // 배열의 값을 저장할 임시변수
            maxIndex = argmax(i, intArrayCopy); // 배열 중 가장 큰 값의 인덱스를 구한다.
            sortedArray[i] = intArrayCopy[maxIndex]; // 제일 큰 값을 sortedArray에 차곡차곡 저장
            intArrayCopy[maxIndex] = temp; // 원래 maxIndex가 있던 자리에 temp를 넣어준다.
        }

//        System.out.println(maxIndex);
//        System.out.println(Arrays.toString(sortedArray));

        return sortedArray;
    }

    public static void main(String[] args) {
        int [] score = {100, 200, 95, 80, 105, 350, 201, 400};

        Func0513 obj1 = new Func0513();

        int value = obj1.maxReturn(score);
//        System.out.println(value);
//        System.out.println(obj1.argmax(score));
        System.out.print("원래 배열입니당 : " + Arrays.toString(score) + "\n");

        System.out.print("내림차순으로 정렬된 배열입니당 : ");
        System.out.println(Arrays.toString(obj1.sortingArray(score)));
//        obj1.argmax(0, score);
//        obj1.argmax(1, score);
//        obj1.argmax(2, score);
//        obj1.argmax(3, score);
//        obj1.argmax(4, score);
//        System.out.println(Arrays.toString(score)); // qna 왜 바뀌지?? 레퍼런스가 넘어가서 그렇습니다.
    }
}
