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
        // HashSet<Integer> hs = new HashSet<>();
        // for(int num : nums){
        //     hs.add(num);
        // }
        // if(hs.size() < nums.length) return true;
        // for(int num : nums){
        //     if (hs.contains(num)){
        //         return true;
        //     }
        //     hs.add(num);
        // }
        return false;
    }
}
