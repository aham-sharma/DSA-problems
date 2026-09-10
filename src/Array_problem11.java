// Reverse an array

import java.util.Arrays;

public class Array_problem11 {

    static int[] Reverse(int[] arr) {
        int temp;
        for (int i = 0; i < (arr.length/2); i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }

    static void main() {
        int[] arr = {2,4,6,3,4,7,8};
        System.out.println(Arrays.toString(Reverse(arr)));
    }

}
