//swapping the alternate extremes of an array

import java.util.Arrays;

public class Array_problem10 {

    static int[] alternateExtreme(int[] arr){
        int temp;
        for (int i = 0; i < (arr.length-1)/2; i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(alternateExtreme(arr)));
    }

}
