// Finding the maximum element in an array

import java.util.Arrays;

public class Array_problem4 {

    public static int maximumFinder(int[] arr){
        int num = 0;
        for (int item: arr){
            if(item>num){
                num = item;
            }
        }
        return num;
    }

    static void main() {

        int[] arr = {2,6,8,4,9,3};
        System.out.println((maximumFinder(arr)));
    }

}
