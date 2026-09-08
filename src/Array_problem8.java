//Swap alternate Element in an array

import java.util.Arrays;

public class Array_problem8 {

    static int[] alternateSwap(int[] arr){
        int temp;

        for (int i=0; i<arr.length-1 ; i+=2){
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        }
    return arr;

    }

    static void main(){

    int[] arr = {2,5,7,3,8,9,8};
        System.out.println(Arrays.toString(alternateSwap(arr)));
}
}