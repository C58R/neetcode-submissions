class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int checkValue = target - num;

            if (map1.containsKey(checkValue)) {
                return new int[] {map1.get(checkValue), i};
            }
            map1.putIfAbsent(num, i);
        }
        return null;
    }
}
