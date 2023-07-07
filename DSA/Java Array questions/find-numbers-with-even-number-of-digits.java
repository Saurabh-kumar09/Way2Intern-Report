class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i = 0 ; i < nums.length ; i++)
            if(numberOfDigits(nums[i]) % 2 == 0)
                result++;
        return result;
    }

    static int numberOfDigits(int n)
    {
        int cnt = 0;
        while(n > 0)
        {
            n /= 10;
            cnt++;
        }
        return cnt;
    }
}
