import java.util.Arrays;

public class concat2Arrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3,9,8,11,6};
        int[] array2 = {4, 5,6,7,9,8};

        int aLen = array1.length;
        int bLen = array2.length;
        int n = aLen+bLen;
        int[] newArr = new int[n];

        for (int i=0; i<aLen; i++){
            newArr[i]=array1[i];
        }

        for (int i=0; i<bLen; i++){
            newArr[i+aLen]=array2[i];
        }
        System.out.println(Arrays.toString(newArr));


    }
}
