class Solution {
    public boolean isAnagram(String s, String t) {
        int[] tracker = new int[26];
        int sLen = s.length(), tLen = t.length();
        if(sLen != tLen) return false;

        for(int i = 0; i < sLen; i++){
            tracker[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < tLen; i++){
            tracker[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < tracker.length; i++){
            if(tracker[i] != 0) return false;
        }
        return true;
    }
}
