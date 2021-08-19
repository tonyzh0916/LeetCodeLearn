/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number 
sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 
Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) 
solution using a different approach?

*/
class Solution {
  public int[] sortedSquares(int[] arr) {
         int n = arr.length;
      // first dived array into part negative and positive
      int k;
      for (k = 0; k < n; k++) {
          if (arr[k] >= 0)
              break;
      }

      // Now do the same process that we learn
      // in merge sort to merge to two sorted array
      // here both two half are sorted and we traverse
      // first half in reverse meaner because
      // first half contain negative element
      int i = k - 1; // Initial index of first half
      int j = k; // Initial index of second half
      int ind = 0; // Initial index of temp array

      int[] temp = new int[n];
      while (i >= 0 && j < n) {
          if (arr[i] * arr[i] < arr[j] * arr[j]) {
              temp[ind] = arr[i] * arr[i];
              i--;
          }
          else {

              temp[ind] = arr[j] * arr[j];
              j++;
          }
          ind++;
      }

      while (i >= 0) {
          temp[ind++] = arr[i] * arr[i];
          i--;
      }
      while (j < n) {
          temp[ind++] = arr[j] * arr[j];
          j++;
      }

          return  temp;
  }
}