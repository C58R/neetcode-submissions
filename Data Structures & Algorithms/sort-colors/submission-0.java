class Solution {
    public void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length - 1;

        // iterate through nums while 
        while (mid <= end) {
            // if mid = 0, move up mid and start
            if (nums[mid] == 0) {
                swap(start, mid, nums);
                start++;
                mid++;
            }
            // if mid = 1, do nothing
            else if (nums[mid] == 1) {
                mid++;
            }
            // if mid = 2, swap with end, then end down
            else {
                swap(mid, end, nums);
                end--;
            }
        }
    }

    public void swap(int i, int ptr1, int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[ptr1];
        nums[ptr1] = tmp;
    }
}