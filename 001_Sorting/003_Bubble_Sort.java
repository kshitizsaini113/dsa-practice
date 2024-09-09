class Solution {

    public int[] sortArray(int[] nums) {
        
        for(int i=0; i<nums.length; i++) {
        // We need to perform the operation at max n times to get the array sorted.

            boolean noSwaps = true;
            // Create a flag noSwap that signifies that no swap was made during the current phase.

            for(int j=0; j<nums.length-1; j++) {
            // Loop through each element of the array.

                if(nums[j]>nums[j+1]) {
                    noSwaps = false;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                // If adjacant array elements are in correct order, let them ramain same.
                // If adjacant array elements are in wrong order, swap them and mark the noSwaps flag as false.

            }

            if(noSwaps) {
                break;
            }
            // In case no swaps are made, it signifies that the array is sorted, hence we can save some time by skipping
            // un-necessary comparisons, and return the array directly.
        }

        return nums;
        // Return the array.
    }

}

// TIME COMPLEXITY : O(n^2)
// SPACE COMPLEXITY : O(1)

// LEETCODE PROBLEM : 912 - Time Limit Exceeded since not the optimized solution
