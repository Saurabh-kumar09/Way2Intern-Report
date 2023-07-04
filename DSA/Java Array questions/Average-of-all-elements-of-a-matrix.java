//JAVA program to find the average of all the elements of a matrix

import java.util.Scanner;


public class avgMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int i = in.nextInt();
        System.out.print("Enter no. of columns: ");
        int j = in.nextInt();
        int[][] matrix = new int[i][j];
        float n = i+j;
        int k;
        float sum=0;
        System.out.print("Enter "+ n + " integers: ");
        for (i=0; i<matrix.length; i++){
            for(j = 0; j<matrix[i].length; j++){
                matrix[i][j]=in.nextInt();
                k = matrix[i][j];
                sum = sum + k;
            }
        }
        System.out.println(sum);
        System.out.println(sum/n);
    }
}
