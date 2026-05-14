class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map1.containsKey(nums[i])) {
                map1.put(nums[i], i);
            } else {
                return true;
            }
            System.out.println(map1);
        }
        return false;
    }
}