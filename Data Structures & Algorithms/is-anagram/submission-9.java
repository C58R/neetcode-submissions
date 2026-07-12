class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { return false; }

        List<Character> param1 = new ArrayList<>();
        List<Character> param2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            param1.add(s.charAt(i));
            param2.add(t.charAt(i));
        }

        Collections.sort(param1);
        Collections.sort(param2);

        System.out.println(param1 + "\n" + param2); // DELETEME
        return param1.equals(param2);
    }
}
