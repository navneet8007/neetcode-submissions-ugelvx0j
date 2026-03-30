class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxSize = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            maxSize = Math.max(maxSize, piles[i]);
        }

        for(int k = 1; k <= maxSize; k++){
            if(canEatAll(piles, k, h)){
                return k;
            }
        }
        return maxSize;
    }

    private static boolean canEatAll(int[] piles, int k, int h){
        int hours = 0;
        for(int pile : piles){
            hours += Math.ceil((double)pile/k);
        }
        return hours <= h;
    }
}
