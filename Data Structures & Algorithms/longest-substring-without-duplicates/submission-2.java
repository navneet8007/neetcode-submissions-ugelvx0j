class Solution {
    public int lengthOfLongestSubstring(String str) {
        int maxLen = 0;
        Map<Character, Integer> tracker = new HashMap<>();
        for(int left = 0, right = 0; right < str.length(); right++){
            char c = str.charAt(right);
            if(tracker.containsKey(c)){
                left = Math.max(left, tracker.get(c) + 1);
            }
            tracker.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
