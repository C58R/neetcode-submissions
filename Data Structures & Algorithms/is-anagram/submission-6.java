class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s.equals(null) || t.equals(null)) return false;
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);
            list1.add(char1);
            list2.add(char2);
        }

        System.out.println(list1 + "\n" + list2);
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);



    }
}
