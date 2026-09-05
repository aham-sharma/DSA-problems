// finding average of the elements in array

public class Array_problem1 {
    static double getAverage(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = (double)sum / size;
        return avg;
    }
    static void main(){
        int[] arr = {2,4,3,6};
        System.out.println(getAverage(arr));

    }
}