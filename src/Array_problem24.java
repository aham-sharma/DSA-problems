//Remove duplicates from a sorted array

import java.util.Arrays;

public class Array_problem24 {

    static int[] removeduplicate(int[] arr){

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

        int[] result = new int[i+1];
        for (int k = 0; k <= i; k++) {
            result[k]=arr[k];
        }

        return result;
    }

    static void main() {

        int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5};
        System.out.println(Arrays.toString(removeduplicate(arr)));

    }

}
