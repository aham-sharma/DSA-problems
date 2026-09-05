public class Array_problem7 {

    static int firstUnsortedNum(int [] arr){
        int comparable = arr[0];
        for(int i : arr){
            if(i < comparable){
                return i;
            }
            comparable = i;
        }
        return -1;
    }

    static void main() {

        int[] arr = {1,2,4,5,6,5,8,9,10};
        if(firstUnsortedNum(arr) == -1){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println(firstUnsortedNum(arr));
        }

    }

}
