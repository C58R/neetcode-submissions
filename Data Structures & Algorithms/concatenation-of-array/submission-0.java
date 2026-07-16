class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];
        int right = nums.length;

        for (int left = 0; left < nums.length; left++) {
            output[left] = nums[left];
            output[right] = nums[left];
            right++;
        }
        return output;
    }
}