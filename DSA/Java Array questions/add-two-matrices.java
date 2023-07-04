// Write a JAVA program to add two matrices

import java.util.Arrays;

public class addMatrix {
    public static void main(String[] args) {
        int[][] arr2d1 = {
                {1,2,3},
                {4,5,7}
        };

        int[][] arr2d2 = {
                {4,3,7},
                {2,9,8}
        };
        int[][] newArr = new int[2][3];
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                newArr[i][j] = arr2d1[i][j] + arr2d2[i][j];
            }
            System.out.println(Arrays.toString(newArr[i]));
        }
    }
}
