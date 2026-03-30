class Solution {
    public int trap(int[] heights) {
        int n = heights.length;
        int[] rightMax = new int[n];
        int[] leftMax = new int[n];
        int result = 0;
        leftMax[0] = heights[0];
        for(int i = 1 ; i < n; i++){
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }
        rightMax[n-1] = heights[n-1];
        for(int j = n-2 ; j >= 0; j--){
            rightMax[j] = Math.max(heights[j], rightMax[j+1]);
        }

        for(int k = 0; k < n; k++){
            result = result + Math.min(leftMax[k], rightMax[k]) - heights[k]; 
        }
        return result;
    }
}
