class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int write = 0; // Pointer to place the next element

        // Step 1: Move all even numbers to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[write];
                nums[write] = nums[i];
                nums[i]= temp;// Place even number at the write position
                write++;                // Increment the write pointer
            }
        }

     
        return nums;  // Return the modified array
    }
}
