class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Set<Character> track = new HashSet<>();
        
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            while (track.contains(s.charAt(right))){
                track.remove(s.charAt(left));
                left++;
            }
            track.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen; 
    }
}
