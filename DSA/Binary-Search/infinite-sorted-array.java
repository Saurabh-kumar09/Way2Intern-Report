//InfiniteSortedArray
//Find Position of an element in a sorted array of infinite number.(Amazon question)
//Link: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class infiniteArray {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,
                67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99,101,103,105,107,109,111,113,115,117,119,121,123,125,
                127,129,131,133,135,137,139,141,143,145,147,149,151,153};
        int target = 65;
        int ans = ans(array, target);
        System.out.println(ans);

    }
    static int ans(int[] array, int target){
        int start = 0;
        int end = 1;

        while(target > array[end]){
            int newStart = end + 1;
            //box size = e-s+1
            //newEnd = previousEnd + boxSize * 2
            end = end + (end-start + 1)*2;
            start = newStart;
        }
        return binarySearch(array, target, start, end);
    }
    static int binarySearch(int[] array, int target, int start, int end){

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < array[mid]){
                end = mid - 1;
            }else if(target > array[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
