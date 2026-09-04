public class Array_problem1 {
    static double getAverage(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }
    static void main(){
        int[] arr = {2,4,6,6};
        System.out.println(getAverage(arr));

    }
}