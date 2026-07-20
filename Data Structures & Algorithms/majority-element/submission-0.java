class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0, max = 0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num,0) + 1);

            if (count.get(num) > max) {
                max = count.get(num);
                res = num;
            }

        }
        return res;
       
        
    }
}