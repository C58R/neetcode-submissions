class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        // iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // find the difference of target and nums[i]
            int num = nums[i];
            int diff = target - num;
            // check if that diff value is in the HashMap
            if (map.containsKey(diff)) {
                // return int[] with the indices
                return new int[] { map.get(diff), i };
            }
            // add diff value to HashMap
            map.put(num, i);
        }
        return new int[] {};
    }
}
