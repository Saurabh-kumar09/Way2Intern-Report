import java.util.Arrays;
import java.util.Scanner;

public class concat1arr {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter length of an array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] newArray = new int[2*n];
        System.out.print("Enter " + n + " integer values: ");
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
            newArray[i] = arr[i];
            newArray[i+n] = arr[i];
        }
        System.out.print("Print new Array after Concatenation: ");
        System.out.println(Arrays.toString(newArray));
    }
}
