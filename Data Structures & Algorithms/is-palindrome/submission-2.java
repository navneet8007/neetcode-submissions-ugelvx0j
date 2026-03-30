class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder newStr = new StringBuilder();
        // for(char c : s.toCharArray()){
        //     if(Character.isLetterOrDigit(c)){
        //         newStr.append(Character.toLowerCase(c));
        //     }
        // }
        // return newStr.toString().equals(newStr.reverse().toString());
        int l = 0, r = s.length()-1;
        while(l < r){
            while(l < r && !validChar(s.charAt(l))) l++;
            while(l < r && !validChar(s.charAt(r))) r--;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validChar(char c){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9'
                );
    }

}
