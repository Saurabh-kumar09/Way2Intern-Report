//Create an Array by taking input from user

//Integer Array
import java.util.Arrays;
import java.util.Scanner;

//public class inputArr {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = new int[4];
//        System.out.println("Enter 4 numbers");
//        for (int i=0; i<arr.length; i++){
//            arr[i] =input.nextInt();
//        }
//        System.out.println("Print array");
//        System.out.println(Arrays.toString(arr));
//    }
//}

//String Array
public class inputArr{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[5];
        System.out.println("Enter 5 strings");
        for (int i=0; i<str.length; i++){
            str[i] = input.next();
        }
        System.out.print("Print array: ");
        System.out.println(Arrays.toString(str));
    }
}
