//Two Sum problem - LeetCode

//By Taking User Input

import java.util.Arrays;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter target number: ");
        int target = input.nextInt();
        System.out.print("Enter integers: ");
        for (int i=0; i<n; i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Check and Print: ");
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == target ){
                    int[] output = { i, j};
                    System.out.println(Arrays.toString(output));
                }else{
                    continue;
                }
            }
        }

    }
}

or, Without taking input

import java.util.Arrays;

public class twoSum{
    public static void main(String[] args) {
        int[] arr = {11,2,7, 15};
        int target = 26;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    int[] result = {i,j};
                    System.out.println(Arrays.toString(result));
                }
                else{
                    continue;
                }
            }
        }
    }
//}
