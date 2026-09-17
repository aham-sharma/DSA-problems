//sort 0's,1's,2's

import java.util.Arrays;

public class Array_problem21 {

    static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                {
                    int temp;
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }


        }
        return arr;
    }

    static void main() {
        int[] arr = {2,1,0,0,2,0,2,1,1,0};
        System.out.println(Arrays.toString(sort(arr)));
    }

}
