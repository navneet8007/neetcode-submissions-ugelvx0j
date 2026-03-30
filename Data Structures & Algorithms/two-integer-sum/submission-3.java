class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> records = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int balance = target - nums[i];
            if(records.containsKey(balance)){
                res[0] = records.get(balance);
                res[1] = i;
                return res;
            }
            else{
                records.put(nums[i], i);
            }
        }
        return res;
    }
}
