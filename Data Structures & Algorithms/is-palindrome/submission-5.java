class Solution {
    // public boolean isPalindrome(String s) {
    //     StringBuffer sb = new StringBuffer();
    //     for(char c : s.toCharArray()){
    //         if (Character.isLetterOrDigit(c))
    //             sb.append(Character.toLowerCase(c));
    //     }
    //     return sb.toString().equals(sb.reverse().toString());
    // }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        int l = 0, r = s.length() - 1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        // while (l < r){
        //     while(l < r && !isValidChar(s.charAt(l))) l++;
        //     while(l < r && !isValidChar(s.charAt(r))) r--;
        //     if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }
        return true;
    }

    // public boolean isValidChar(char c){
    //     return( c >= 'A' && c <= 'Z' ||
    //             c >= 'a' && c <= 'z' ||
    //             c >= '0' && c <= '9'
    //         );
    // }
}
