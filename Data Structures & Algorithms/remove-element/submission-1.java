class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) { return 0; }

         int writerPtr = 0;

         for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[writerPtr] = nums[i];
                writerPtr++; 
            }
         }
         return writerPtr;
    }
}