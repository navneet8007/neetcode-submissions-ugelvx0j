class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        //************Iterative***************
        // while(low <= high){
        //     int mid = (low + high)/2;
        //     if(nums[mid] == target){
        //         return mid;
        //     }else if(nums[mid] < target){
        //         low = mid + 1;
        //     }else{
        //         high = mid - 1;
        //     }
        // }
        return binSearch( nums, low, high,  target);
    }
    static int binSearch(int[] nums, int low, int high, int k){
        if(low <= high){
            int mid = (low + high)/2;
            if (nums[mid] == k)
                return mid;
            if(nums[mid] < k)
                return binSearch(nums, mid+1, high, k);
            return binSearch(nums, low, mid-1, k);
        }
        return -1;
    }
}
