public class Sort {
    // 4. Selection Sorting 함수를 작성해보자
    // ascend == true 면 오름차순, false면 내림차순으로
    void selectionSort(int []a, boolean ascend) {
        // 이건 내가 다시 한 버전
        /*int keyValue = a[0];

        if (ascend) {
            for (int i = 0; i < a.length; ++i) {
                swap(a, i, argMin(a, i));
            }
        }
        else {
            for (int i = 0; i < a.length; ++i) {
                swap(a, i, argMax(a, i));
            }
        }*/

        // 교수님 버전
//        int key = a[0];
        int tarketIdx = 0; // 바꿔야 하는 target idx

        for (int i = 0; i < a.length; ++i) {
            // 오름차순 배열, 작은 것이 왼쪽으로 큰 것이 오른쪽으로
            if (ascend) {
                tarketIdx = argMin(a, i);
            }
            else {
                tarketIdx = argMax(a, i);
            }
            swap(a ,i, tarketIdx);
        }
    }

    // 5. Bubble Sorting 함수를 작성해보자
    // ascend == true면 오름차순, false면 내림차순
    void bubbleSort(int []a, boolean ascend) {
        for (int i = a.length - 1; i >= 0; --i) {
            for (int j = 0; j < i; ++j) { // j랑 j+1이랑 swap할거라서 j는 a.length - 2까지 가야함
                // 오름차순 : 작은 것이 왼쪽으로, 큰 것이 오른쪽으로
                if (ascend) {
                    if (a[j] > a[j+1]) swap(a, j, j+1);
                }
                // 내림차순 : 작은 것이 오른쪽으로, 큰 것이 왼쪽으로
                else {
                    if (a[j] < a[j+1]) swap(a, j, j+1);
                }
            }
        }
    }


    // 1. argMin 함수를 작성해보자
    // 배열과 starting point(index)를 받으면 시작점으로부터 가장 작은 값의 인덱스를 리턴해주는 함수
    int argMin(int []a, int startIdx) {
        // 1. 예외처리 - 배열은 꼭 예외처리 해줘야한다.
        if (startIdx < 0 || startIdx >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // 2. 일단 최소값을 startIdx의 값으로 초기화 한다.
        int minValue = a[startIdx];
        int minIndex = startIdx;

        for(int i = startIdx; i < a.length; ++i) {
            if (minValue > a[i]) {
                minValue = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // 2. argMax 함수를 작성해보자 ==> argMin과 똑같음
    int argMax(int []a, int startIdx) {
        if (startIdx < 0 || startIdx >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int maxValue = a[startIdx];
        int maxIndex = startIdx;

        for (int i = startIdx; i < a.length; ++i) {
            if (maxValue < a[i]) {
                maxValue = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // 3. swap하는걸 만들어보자고
    // a 배열의 i번째와 j번째를 바꾸는 메서드
    void swap (int []a, int i, int j) {
        // 1. 예외처리~
        if (i < 0 || i >= a.length || j < 0 || j >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // 2. 바꿔봅시다. ==> 임시변수 필요
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
