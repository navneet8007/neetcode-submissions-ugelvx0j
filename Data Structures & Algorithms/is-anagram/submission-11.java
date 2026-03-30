class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        int tLen = t.length(),  sLen = s.length();
        if (tLen != sLen) return false;
        for(int i = 0; i < tLen; i++){
            counts[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < tLen; i++){
            counts[s.charAt(i) - 'a']--;
        }
        for(int count : counts){
            if(count != 0) return false;
        }

        return true;
    }
}
