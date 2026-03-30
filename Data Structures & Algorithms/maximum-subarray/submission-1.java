class Solution {
    public int maxSubArray(int[] nums) {
        // BruteFoce
        // int maxSum = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i ; j < nums.length; j++){
        //         sum += nums[j];
        //         maxSum = Math.max(maxSum, sum);
        //     }
        // }
        int currSum = nums[0], maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum , currSum);
        }
        return maxSum;
    }
}
