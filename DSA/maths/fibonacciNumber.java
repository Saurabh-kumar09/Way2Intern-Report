//Brute force approach
// Time complexity : O(n)
// Space Complexity : O(1)
class Solution {
    public int fib(int n) {
        int fNum = 0;
        int sNum = 1;
        int nextNum = 0;
        if (n==0 || n==1){
            return n;
        }
        else{
            for(int i=1; i<n;i++){
            nextNum = fNum + sNum;
            fNum = sNum;
            sNum = nextNum;
            if(i == n-1){
                break;
            }
          }
        }
        
        return nextNum;
    }
} 

