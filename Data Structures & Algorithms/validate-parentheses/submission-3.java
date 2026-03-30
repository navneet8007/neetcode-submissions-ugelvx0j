class Solution {
    public boolean isValid(String s) {
        Map<Character,Character > closed2Open = new HashMap<>();
        Stack<Character> stk = new Stack<>();
        closed2Open.put(')','(');
        closed2Open.put('}','{');
        closed2Open.put(']','[');

        for(char c : s.toCharArray()){

            if(closed2Open.containsKey(c)){
                if(!stk.isEmpty() && stk.peek() == closed2Open.get(c)){
                    stk.pop();
                }else{
                    return false;
                }
            }else{
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
}
