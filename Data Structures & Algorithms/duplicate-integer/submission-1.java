class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        int len = nums.length;
        while(i < j && j < len){
           if (nums[i] == nums[j]){
                return true;
           }else{
                i++;
                j++;
           }
        }
        return false;
    }
}
