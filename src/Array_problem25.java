//find the First Repeating Element in an array

import java.util.HashMap;

public class Array_problem25 {

    static int FirstRepeatingElement(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr){
            freq.put(num , freq.getOrDefault(num, 0) + 1);
        }
        for (int i : arr){
            if (freq.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }

    static void main() {
        int[] arr = {1,5,3,5,4,6,7,0,9};
        System.out.println(FirstRepeatingElement(arr));
    }

}
