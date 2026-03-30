class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Sort the characters of the string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add to the map
            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        // Collect all the grouped anagrams
        return new ArrayList<>(map.values());
    }
}
