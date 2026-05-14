class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> compare = new HashMap<>(); // <sortedChars,s>
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedChars = new String(c);
            
            compare.putIfAbsent(sortedChars, new ArrayList<>());
            compare.get(sortedChars).add(s);
        }
        return new ArrayList(compare.values());
    }
}
