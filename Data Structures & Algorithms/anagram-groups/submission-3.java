class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            String key = calculateAnagram(str);
            List<String> value = new ArrayList<>();
            
            anagrams.putIfAbsent(key, value);
            anagrams.get(key).add(str);
        }
        List<List<String>> output = new ArrayList<>(anagrams.values());
        return output;

    }

    public String calculateAnagram(String str) {
        int[] abc = new int[26];

        for (int i = 0; i < str.length(); i++) {
            abc[str.charAt(i) - 'a']++;
        }

        return Arrays.toString(abc);
    }
}
