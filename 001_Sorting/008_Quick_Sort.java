class Solution {

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    /**
    quickSort Method
    * This method takes three parameters:
        nums : the array to be sorted
        low : the starting index of the subarray to be sorted
        high : the ending index of the subarray to be sorted
    * If low is less than high , it means the subarray has more than one element and needs to be sorted.
    * It calls the partition method to partition the subarray around a pivot element.
    * It recursively calls quickSort on the subarray to the left of the pivot ( low to index - 1 ) and the subarray to the right of the pivot ( index + 1 to high ).
     */
    static void quickSort(int nums[], int low, int high) {
        if (low < high) {
            int index = partition(nums, low, high);
            quickSort(nums, low, index - 1);
            quickSort(nums, index + 1, high); 
        }
    }

    /**
    partition Method
    * This method takes three parameters:
        nums: the original array
        low: the starting index of the subarray to be partitioned
        high: the ending index of the subarray to be partitioned
    * It selects the first element of the subarray as the pivot (pivot = nums[low]).
    * It initializes two indices:
        i: the index of the first element greater than the pivot (starts at low)
        j: the index of the last element less than or equal to the pivot (starts at high)
    * It partitions the subarray by swapping elements that are out of place:
        If nums[i] is less than or equal to the pivot, increment i.
        If nums[j] is greater than the pivot, decrement j.
    * If i is less than j, swap nums[i] and nums[j].
    * Once i meets j, swap the pivot element with nums[j].
    * Return the final index of the pivot element (j).
     */
    static int partition(int nums[], int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i < high && nums[i] <= pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        nums[low] = nums[j];
        nums[j] = pivot;
        return j;
    }
}

// TIME COMPLEXITY : O(n * log(n))
// SPACE COMPLEXITY : O(n)

// LEETCODE PROBLEM : 912 - Time Limit Exceeded
