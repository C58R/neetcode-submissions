class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] abcArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            abcArr[s.charAt(i) - 'a']++;
            abcArr[t.charAt(i) - 'a']--;
        }

        for (int num : abcArr) {
            if (num != 0) return false;
        }

        return true;
        
    }
}
