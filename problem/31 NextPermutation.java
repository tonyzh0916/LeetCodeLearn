/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
Example 4:

Input: nums = [1]
Output: [1]
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100
*/

class Solution{
  public void nexPermutation(int[] nums){
    int i = nums.length-2;
    while(i>=0 && nums[i+1]<=nums[i]){
      i--;
    }

    if(i==-1){
      Arrays.sort(nums);
      return;
    }

    int j = nums.length-1;
    while(j>=0 && nums[j]<=nums[i]){
      j--;
    }
    swap(nums, i, j);
    reverse(nums, i+1);
  }

  private void reverse(int[] nums, int i){
    int left = i;
    int right = nums.length-1;
    while(left<right){
      swap(nums, left, right);
      left ++;
      right --;
    }
  }

  private void swap(int[] num, int i; int j){
    int num = nums[i];
    nums[i] = num[j];
    num[j] = num;
  }
}