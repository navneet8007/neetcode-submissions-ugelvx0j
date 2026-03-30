class Solution {
    public boolean isAnagram(String s, String t) {

        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen) return false; 
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();
        // Arrays.sort(sArray);
        // Arrays.sort(tArray);
        // for(int i = 0; i < sLen; i++){
        //     if(sArray[i] != tArray[i]) return false;
        // }
        //return Arrays.equals(sArray, tArray);
        int[] counts = new int[26];
        for(int i = 0; i < s.length(); i++){
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
