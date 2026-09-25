//Missing Array from an array with duplicates

import java.util.ArrayList;
import java.util.List;

public class Array_problem27 {

    static List<Integer> findDisappeardNumbers(int[] arr){

        List<Integer> ans = new ArrayList<>();
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);
            int position = value - 1;
            if (arr[position]>0){
                arr[position] = -arr[position];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                int valueAtthisIndex = i+1;
                ans.add(valueAtthisIndex);
            }
        }
        return ans;
    }

    static void main() {
        int[] arr = {1,2,2,4,5,5,5,5,8};
        System.out.println(findDisappeardNumbers(arr));
    }

}
