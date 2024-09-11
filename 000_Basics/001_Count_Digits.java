/*
Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.

PROBLEM LINK : https://practice.geeksforgeeks.org/problems/count-digits5716/1
*/

class Solution{
    
    /** 
    The evenlyDivides method takes an integer N as input and returns the count of digits in N that can evenly divide N without leaving a remainder.
    
    Algorithm
    * Initialize:
        Set count to 0.
        Store the input N in originalNumber.
    * Extract Digits:
        While originalNumber is not 0:
            Extract the last digit of originalNumber as digit.
            Remove the last digit from originalNumber.
    * Check Divisibility:
        For each extracted digit:
            If digit is not 0 and N is divisible by digit (i.e., N % digit == 0):
                Increment count by 1.
    * Return:
        Return the final count.
     */
    static int evenlyDivides(int N) {
        int originalNumber = N;
        int count = 0;
    
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            originalNumber /= 10;
    
            if (digit != 0 && N % digit == 0) {
                count++;
            }
        }
    
        return count;
    }
}

// TIME COMPLEXITY : O(log10(n))
// SPACE COMPLEXITY : O(1)
