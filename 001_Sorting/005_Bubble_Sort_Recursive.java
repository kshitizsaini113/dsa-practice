class Solution
{
  //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        
        if(n==1) {
            return;
        }
        // If the length of the array is 1, it's already sorted (or empty), so return immediately.
        
        int count = 0;
        // Initialize a counter to keep track of swaps made during the sorting process.
        
        for(int i=0; i<n-1; i++) {
        // Iterate through the array, starting from the first element (index 0) to the second-to-last element (index n-2).
        
            if(arr[i] > arr[i+1]) {
            // For each element, compare it with the next element (arr[i] and arr[i+1]).
            
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                // For each element, compare it with the next element (arr[i] and arr[i+1]).
                
                count++;
                // Increment the swap counter count.
                
            }
            
        }
        
        if(count == 0) {
        // If no swaps were made during the entire iteration, the array is already sorted, so return immediately.
            return;
        }
        
        bubbleSort(arr, n-1);
        // Call the bubbleSort method recursively with the same array and n-1 as the new length.
        
    }
    
}
