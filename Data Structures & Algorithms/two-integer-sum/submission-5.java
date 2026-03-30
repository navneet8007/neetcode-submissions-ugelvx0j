class Solution {
    public int[] twoSum(int[] nums, int target) {
        // BruteForce
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(hm.containsKey(rem)){
                return new int[] { hm.get(rem), i};
            }
            hm.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
