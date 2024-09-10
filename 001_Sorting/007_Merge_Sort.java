class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    /*
    mergeSort Method
    * This method takes three parameters:
        nums: the array to be sorted
        left: the starting index of the subarray to be sorted
        right: the ending index of the subarray to be sorted
    * If left is less than right, it means the subarray has more than one element and needs to be sorted.
    * It calculates the midpoint mid of the subarray.
    * It recursively calls mergeSort on the left half of the subarray (left to mid) and the right half (mid + 1 to right).
    * Finally, it calls the merge method to merge the two sorted halves.
     */
    public void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    /**
    merge Method
    * This method takes four parameters:
        nums: the original array
        left: the starting index of the left half
        mid: the ending index of the left half
        right: the ending index of the right half
    * It creates a temporary array temp to store the merged result.
    * It initializes three indices:
        index: the current index in the temp array
        l: the current index in the left half
        r: the current index in the right half
    * It merges the two halves by comparing elements from both halves and placing the smaller element in the temp array.
    * Once one half is exhausted, it copies the remaining elements from the other half into the temp array.
    * Finally, it copies the sorted elements from the temp array back into the original array.
     */
    public void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right-left+1];
        int index = 0;
        int l = left;
        int r = mid + 1;

        while (l <= mid && r <= right) {
            if (nums[l] < nums[r]) {
                temp[index] = nums[l];
                l++;
            } else {
                temp[index] = nums[r];
                r++;
            }
            index++;
        }

        while (l <= mid) {
            temp[index] = nums[l];
            l++;
            index++;
        }

        while (r <= right) {
            temp[index] = nums[r];
            r++;
            index++;
        }

        for (int i = 0; i < temp.length; i++) {
            nums[left + i] = temp[i];
        }
    }
}
