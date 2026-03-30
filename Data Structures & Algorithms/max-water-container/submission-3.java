class Solution {
    public int maxArea(int[] heights) {
        int left = 0, n = heights.length, right = n - 1;
        int maxArea = 0;
        while(left < right){
            int currArea = Math.min(heights[left], heights[right]) * (right - left);
            maxArea = Math.max(currArea, maxArea);
            if(heights[left] < heights[right])
                left++;
            else    
                right--;
        }
        return maxArea;
    }
}
