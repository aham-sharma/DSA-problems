//multiply each element of an array by 10 then put all of them into a new array completely

import org.w3c.dom.ls.LSOutput;
import java.util.Arrays;

public class Array_problem2 {

    static int[] multiplyByten(int[] arr){
        int size = arr.length;
        int[] newArray = new int[size];

        for(int i = 0; i < size; i++){
            int element = arr[i];
            int newElement = element*10;
            newArray[i]=newElement;
        }
        return newArray;
    }

    public static void main() {

        int[] arr = {3,5,3,6,7,8,5};
        System.out.println(Arrays.toString(multiplyByten(arr)));

    }
    }

