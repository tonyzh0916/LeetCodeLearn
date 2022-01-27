/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are 
adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 
Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 
Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/
class Solution {
  public void sortColors(int[] nums) {
      int point0 =0;
      int point2 = nums.length-1;
      int i = 0;

      while(i<=point2){
        if(nums[i]==0){
          swap(nums, point0, i);
          i++;
          point0++;
        }else if(nums[i]==1){
          i++;
        }else{
          swap(nums, point2,i);
          point2--;
        }

      }
  }
  public void swap(int[] nums, int a, int b){
    int tmp = nums[a];
    nums[a]=nums[b];
    nums[b]=tmp;
  }
}