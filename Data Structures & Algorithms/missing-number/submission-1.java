class Solution {
    public int missingNumber(int[] nums) {
        // int sum = 0;
        // for(int i = 0; i <= nums.length; i++){
        //     sum += i;
        // }
        // for(int i = 0; i < nums.length; i++){
        //     sum -= nums[i];
        // }
        // return sum;
        int n = nums.length;
        int xor = n;
        for(int i = 0; i < n ; i++){
           xor = xor ^ i ^ nums[i];
        }
        return xor;
    }
}
