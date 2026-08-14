class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        // iterate through strs
        for (String s : strs) {
            
            // append element's length, '#', & string name into one string
            res.append(s.length()).append("#").append(s);

        }
        // return string
        return res.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        // iterate through str[i]
        while (i < str.length()) {
            // if char = '#' then get the substrings of the length
            // use the length to pull the next substring
            // move up i to look for the next '#' sign
            int j = str.indexOf('#', i); // 5#hello5#world
            int length = Integer.parseInt(str.substring(i, j));

            i = j + 1;

            String s = (str.substring(i, length + i));
            res.add(s);

            i += length;
        }

        return res;
    }
}
