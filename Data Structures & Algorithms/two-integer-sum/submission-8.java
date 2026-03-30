class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i = 0; i < nums.length; i++ ){
        //     for (int j = i + 1; j < nums.length; j++){
        //         if (nums[i] + nums[j] == target){
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        Map<Integer, Integer> tracker = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(tracker.containsKey(rem)){
                return new int[] {tracker.get(rem), i};
            }
            tracker.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
