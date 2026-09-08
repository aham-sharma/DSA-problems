//finding the intersection of two array or arraylist

import java.util.ArrayList;

public class Array_problem9 {

    static ArrayList<Integer> intersection(int[] arr, int[] brr){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int item : arr){
            for (int value : brr){
                if (item == value){
                    temp.add(value);
                }
            }
        }

        return temp;
    }

    static void main() {
    int[] arr = {1,2,5,6,8,9};
    int[] brr = {3,4,5,6,4,3};

        System.out.println(intersection(arr,brr));
    }

}
