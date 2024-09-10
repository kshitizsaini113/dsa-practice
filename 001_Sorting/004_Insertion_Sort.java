class Solution {

    public int[] sortArray(int[] nums) {
        
        for(int i=1; i<nums.length; i++) {
        // Iterate the array from 1 to n. We are iterating from as we will be comparing two elements in each iteration.
        // n elements -> n-1 iterations will be required.

            int key = nums[i];
            // Select the pivot element for which we need to find the correct position and insert in the array.

            int j = i-1;
            // Since we need to compare from the beginning, we need to iterate from (i-1)th position.

            while(j>=0 && nums[j]>key) {
            // Compare the elements from jth index to ith index and shift all the greater elements one position to
            // right. We will leave the sorted index as is.
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = key;
            // Since the loop is completed, the min index remains as is, with a dummy value, so we need to place the
            // correct element in it's place, hence substituting the key element.

        }

        return nums;
        // Return the array.
    }

}

// TIME COMPLEXITY : O(n^2)
// SPACE COMPLEXITY : O(1)

// LEETCODE PROBLEM : 912 - Time Limit Exceeded since not the optimized solution
