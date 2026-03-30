class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
