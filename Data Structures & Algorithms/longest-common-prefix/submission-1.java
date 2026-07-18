class Solution {
    public String longestCommonPrefix(String[] strs) {
        // iterate through the chars of strs[0]
        for (int i = 0; i < strs[0].length(); i++) {

            // iterate through the elements of strs
            for (String n : strs) {
                
                // check edge cases or differences from char[0].charAt(i) != n.charAt(i) 
                if (i == n.length() || n.charAt(i) != strs[0].charAt(i)) {
                    return n.substring(0, i);
                }

            }
        }
        return strs[0];
    }
}