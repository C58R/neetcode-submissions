class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];
        int n = nums.length;

        for (int left = 0; left < n; left++) {
            output[left] = nums[left];
            output[left + n] = nums[left];
        }
        return output;
    }
}