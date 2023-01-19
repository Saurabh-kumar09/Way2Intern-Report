//Write a Java program to find the sum of all the elements of a matrix.

import java.util.Arrays;

public class sumMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2},
                {1,2},
        };
        int k;
        int sum =0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                k=matrix[i][j];
                sum = sum + k;
            }
        }
        System.out.print(sum);
    }
}
