class Solution {
    public int maxProfit(int[] prices) {
        int mxProfit = Integer.MIN_VALUE;
        int minPrice = prices[0];
        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]); 
            mxProfit = Math.max(mxProfit, prices[i] - minPrice );
        }
        return mxProfit;
    }
}
