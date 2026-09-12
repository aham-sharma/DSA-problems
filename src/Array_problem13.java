// Shift array elements by K position

import java.util.Arrays;

public class Array_problem13 {

    int temp;
    static int[] ShiftbyK(int[] arr , int k){
        for(int j=0;j<k;j++){
        int temp = (arr[arr.length -1]);
        for (int i=arr.length - 1; i>0; i--) {

            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        }
        return arr;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(ShiftbyK(arr, 4)));
    }
}

