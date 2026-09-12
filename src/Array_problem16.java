//Union of an array


import java.util.ArrayList;

public class Array_problem16 {

    static ArrayList<Integer> Union(int[] arr, int[] brr){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int item : arr){
           if(!temp.contains(item)){
               temp.add(item);
           }
        }
        for(int item : brr){
            if (!temp.contains(item)) {
                temp.add(item);
            }
        }
    return temp;
    }

    static void main() {
    int[] arr = {1,2,3,4,5,6};
    int[] brr = {4,5,6,7,8,9};
        System.out.println(Union(arr ,brr));
    }

}
