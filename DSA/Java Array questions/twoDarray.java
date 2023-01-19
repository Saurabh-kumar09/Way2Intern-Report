//Initialize a 2D array and print it.

import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int[][] arr2d = new int[2][3];
        arr2d[0][0]= 1;
        arr2d[0][1]= 2;
        arr2d[0][2]= 3;
        arr2d[1][0]= 4;
        arr2d[1][1]= 5;
        arr2d[1][2]= 6;

        //System.out.println(arr2d.length);

        //for loop
//        for (int row=0; row<arr2d.length; row++){
//            for(int col=0;col<arr2d[row].length;col++){
//                System.out.print(arr2d[row][col]+ " ");
//            }

        //for each loop
//        for (int[] row:arr2d){
//                System.out.println(Arrays.toString(row));
//        }

        //toString
        for (int row=0; row<arr2d.length; row++){
            System.out.println(Arrays.toString(arr2d[row]));
        }
        System.out.println();

    }
}
