class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Calculate the product of all elements to the left of each index
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < i; j++) {
                product *= nums[j];
            }
            result[i] = product;
        }

        int product = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }

        return result;
    }
}
