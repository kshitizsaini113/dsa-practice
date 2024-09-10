class Solution
{
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      
      if(n<=1) {
      // If the length of the array is 1 or less, it's already sorted (or empty), so return immediately.
          return;
      }
      
      insertionSort(arr, n-1);
      // Call the insertionSort method recursively with the same array and n-1 as the new length.
      // This reduces the problem size by 1, allowing the algorithm to sort smaller subarrays.
      
      int last = arr[n-1];
      // Store the last element of the array (arr[n-1]) in a variable last.
      
      int j = n-2;
      while(j>=0 && arr[j] > last) {
      // Iterate backwards through the array, starting from j, as long as arr[j] is greater than last.
      
          arr[j+1] = arr[j];
          j--;
          // In each iteration, shift the element arr[j] one position to the right by assigning arr[j+1] = arr[j].
          
      }
      
      arr[j+1] = last;
      // Once the shifting is done, insert the last element at the correct position (j+1).
      
  }
  
}

// TIME COMPLEXITY : O(n^2)
// SPACE COMPLEXITY : O(1)

// LEETCODE PROBLEM : 912 - Time Limit Exceeded since not the optimized solution
