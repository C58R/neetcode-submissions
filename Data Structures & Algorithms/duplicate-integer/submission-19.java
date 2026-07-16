class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        // iterate through nums 
        for (int i = 0; i < nums.length; i++) {
            
            // if seen contains the current value at nums[i] then return true; 
            if (seen.contains(nums[i])) { return true; }
            else { seen.add(nums[i]); }
        }
        return false;
    }
}