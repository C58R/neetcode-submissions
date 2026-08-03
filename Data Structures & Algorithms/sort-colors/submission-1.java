class Solution {
    public void sortColors(int[] nums) {
        // use pointers to keep track of the beginning, middle, and end of the array
        int left = 0, i = 0, right = nums.length - 1;

        // iterate through nums, use if-else statements if current idx is 0, 1, 2
        while (i <= right) {
            
            // if 0, move left++ and mid++
            if (nums[i] == 0) {
                swap(i, left, nums);
                left++;
                i++;
            }


            // if 1, move mid++
            else if (nums[i] == 1) {
                i++;
            }

            // if 2, swap with end and move end--
            else {
                swap(i, right, nums);
                right--;
            }
            System.out.println(i);
        }
    }

    public void swap(int i, int j, int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}