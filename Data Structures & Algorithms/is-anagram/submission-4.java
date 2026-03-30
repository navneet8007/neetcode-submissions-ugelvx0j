class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        int slen = s.length(), tlen = s.length();
        if(slen != tlen) return false;
        for(int i = 0; i < slen; i++){
            counts[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < t.length(); j++){
            counts[t.charAt(j) - 'a']--;
        }
        for(int count : counts){
            if(count != 0) return false;
        }

        return true;
    }
}
