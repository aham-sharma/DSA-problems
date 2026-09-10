// Shift array elements by one position

import java.util.Arrays;

public class Array_problem12 {

    int temp;
    static int[] Shift(int[] arr){
        int temp = (arr[arr.length -1]);
        for (int i=arr.length - 1; i>0; i--) {

            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(Shift(arr)));
    }
}
