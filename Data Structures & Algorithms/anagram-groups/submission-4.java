class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> tracker = new HashMap<>();
        
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);

            tracker.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(tracker.values());
    }
}
