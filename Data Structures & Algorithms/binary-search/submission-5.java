class Solution {
    public int binarySearch(int left, int right, int[] nums, int target){
        int mid = (left + right) / 2; // mid formula
        if (left > right) return -1; // base conditon
        if(target == nums[mid]) return mid;
        if(target > nums[mid])
           return binarySearch(mid + 1, right, nums, target);
        else 
           return  binarySearch(left, mid - 1, nums, target);
    }

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }
}
