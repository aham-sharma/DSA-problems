public class Array_problem3 {
    static boolean linearSearch(int[] arr, int num){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
    static void main() {
        int[] arr = {3,5,7,3,4,8,5};
        int num = 9;
        if(linearSearch(arr,num)){
            System.out.println("the array contains the number");
        }
        else{
            System.out.println("the array does not contains the number");
        }

    }
}
