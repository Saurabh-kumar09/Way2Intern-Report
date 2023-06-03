//Bubble sort program
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={1,2,5,4,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the outer loop n-1 times
        for (int i=0; i<arr.length;i++){
            swapped = false;
            //run the inner loop n-i times
            //on each check, max value come at last lindex
            for (int j=1; j<arr.length-i;j++){
                //swap if the value is smaller than previous
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if value not swapped, it means the array is sorted, hence stop the program.
            if(!swapped){
                break;
            }
        }
    }
}
