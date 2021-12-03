/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given 
target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
*/

class Solution {
  public int[] searchRange(int[] nums, int target) {
      if(nums==null || nums.length==0) return new int[]{-1, -1}; 
      
      int left = findLeft(nums, target);
      int right = findRight(nums, target);
      
      return new int[]{left, right};
  }
  
  private int findLeft(int[] nums, int target){
      int left = 0;
      int right = nums.length-1;
      
      while(left+1<right){
          int mid = left+(right-left)/2;
          if(nums[mid]>=target){
              right = mid;
          }else{
              left = mid;
          }
      }
      
      if(nums[left]==target){
          return left;
      }else if(nums[right]==target){
          return right;
      }else{
          return -1;
      }
  }
  
  private int findRight(int[] nums, int target){
      int left =0;
      int right = nums.length-1;
      
      while(left+1<right){
          int mid = left+(right-left)/2;
          if(nums[mid]<=target){
              left = mid;
          }else{
              right = mid;
          }
      }
      
      if(nums[right]==target){
          return right;
      }else if(nums[left]==target){
          return left;
      }else{
          return -1;
      }
  }
}