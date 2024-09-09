class Solution {

    public int[] sortArray(int[] nums) {
        int minIdx = 0;
        // Initialize the minIndex element as 0, so that we don't need to define it again and again inside the loop.

        for(int i=0; i<nums.length; i++) {
        // Iterate all the elements of loop. Iterating the elements will help uss in indentifying the beginning index 
        // where to start with when finding the index of subsequent minimum element in the array.

            minIdx = i;
            // Initialize the min index to i, as we need to compare only the subsequent elements, not the former ones.

            for(int j=i+1; j<nums.length; j++) {
            // In the internal loop, iterate the elements from i+1 to end. We perform this operation to get the
            // index for minimum element.

                if(nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
                // Compare the elements and compute the index for minimum element.

            }

            int key = nums[minIdx];
            // Store the min element so that it can be swapped at last.
            
            while(minIdx>i) {
                nums[minIdx] = nums[minIdx-1];
                minIdx--;
            }
            // Swap the elements from index i to minIdx by 1 pace to the right.

            nums[i] = key;
            // Insert the min element at i-th index.
            
        }

        return nums;
        // Return the array which contains the sorted elements.
    }

}

// TIME COMPLEXITY : O(n^2)
// SPACE COMPLEXITY : O(1)

// LEETCODE PROBLEM : 912 - Time Limit Exceeded since not the optimized solution
