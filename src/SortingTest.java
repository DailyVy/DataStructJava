import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        int [] data = {25, 34, 86, 84, 19, 2, 91, 10, 9};

        Sort sort = new Sort();
        // argMax, argMin 확인
        System.out.println(sort.argMax(data, 0));
        System.out.println(sort.argMin(data, 0));

        // swap을 확인해보자
        System.out.println(Arrays.toString(data));
        sort.swap(data, 0, 1);
        System.out.println(Arrays.toString(data));

        // selection sort를 해봅시다
        // 오름차순
        sort.selectionSort(data, true);
        System.out.println(Arrays.toString(data));
        // 내림차순
        sort.selectionSort(data, false);
        System.out.println(Arrays.toString(data));

        // bubble sort를 해봅시다
        sort.bubbleSort(data, true);
        System.out.println(Arrays.toString(data));

    }
}
