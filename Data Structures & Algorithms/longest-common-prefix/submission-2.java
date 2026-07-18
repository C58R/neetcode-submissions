class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for (String n : strs) {
                if (i == n.length() || n.charAt(i) != strs[0].charAt(i)) {
                    return n.substring(0, i);
                }
            }
        }
        return strs[0];
    }
}