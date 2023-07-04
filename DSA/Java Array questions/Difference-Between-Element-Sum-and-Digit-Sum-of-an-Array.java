import java.lang.Math;
public class differenceOfSum {
    public static void main(String[] args) {
        int[] arr={1,15,6,3};
        int k;
        int eSum = 0;
        int dSum = 0;
        for(int i=0; i<arr.length; i++ ){
            k = arr[i];
            eSum = eSum + k;
            while(arr[i] != 0) {
                dSum += arr[i] % 10;
                arr[i] /= 10;
            }
        }

            int differenceSum = eSum - dSum;
            System.out.println(Math.abs(differenceSum));
   }
}
  
