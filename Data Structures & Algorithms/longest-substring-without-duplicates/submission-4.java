class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLen = 0;
        Set<Character> tracker = new HashSet<>();
        for(int left = 0, right = 0; right < s.length(); right++){
            while(tracker.contains(s.charAt(right))){
                tracker.remove(s.charAt(left));
                left++;
            }
            tracker.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
