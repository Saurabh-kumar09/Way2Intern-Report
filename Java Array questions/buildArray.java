import java.util.Arrays;

public class buildArray {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4,0};
        int n = arr.length;
        int[] newArr = new int[n];
        for (int i=0; i<n; i++){
            newArr[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(newArr));
        //newArr[i] = arr[arr[i]]

    }
}
