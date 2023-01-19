//Take an input for a 2D array and print it.

import java.util.Scanner;

public class arrayTwoDInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int i = input.nextInt();
        System.out.print("Enter no. of columns: ");
        int j = input.nextInt();
        int[][] arr2d = new int[i][j];
        System.out.print("Enter "+ i*j + " integers: ");
        for (i=0; i<arr2d.length; i++){
            for(j = 0; j<arr2d[i].length; j++){
                arr2d[i][j] = input.nextInt();
            }
        }

        System.out.println("Print the 2D array: ");
        for (i=0; i<arr2d.length; i++){
            for(j= 0; j<arr2d[i].length; j++){
                System.out.print(arr2d[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
