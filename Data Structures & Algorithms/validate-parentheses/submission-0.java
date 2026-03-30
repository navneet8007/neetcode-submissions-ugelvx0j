class Solution {
    public boolean isValid(String s) {
        // while(s.contains("{}") || s.contains("()") || s.contains("[]") ){
        //     s = s.replace("()", "");
        //     s = s.replace("[]", "");
        //     s = s.replace("{}", "");
        // }
        // return s.isEmpty();
        Stack<Character> st = new Stack<>();
        Map<Character, Character> close2Open = new HashMap<>();
        close2Open.put(']', '[');
        close2Open.put(')', '(');
        close2Open.put('}', '{');
        for(char c : s.toCharArray()){
            if(close2Open.containsKey(c)){
                if(!st.isEmpty() && st.peek() == close2Open.get(c)){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
