//find two numbers in array that adds up to be the target

import java.util.Arrays;

public class Array_problem18 {

        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }

            return new int[]{};
        }


    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

}
