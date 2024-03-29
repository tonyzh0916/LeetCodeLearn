/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, 
return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
*/
class Solution{
  public int searchInsert(int[] nums, int target){
    if(nums==null || nums.length==0) return 0;
    
    int left = 0;
    int right = nums.length-1

    while(left+1<right){
      int mid = left +(right-left)/2;
      if(nums[mid]==target) return mid;
      if(nums[mid]<target){
        left = mid;
      }else{
        right = mid;
      }
    }

    if(nums[left]>=target){
      return left;
    }else if(nums[left]<target && nums[right]>=target){
      return right;
    }else{
      return nums.length;
    }

  }
}

///  12/07/2021
class Solution{
  public int searchInsert(int nums, int target){
    if(nums==null || nums.length()==0) return 0;

    int left = 0;
    int right = nums.length()-1;
    while(left+1<right){
      int mid = left + (right-left)/2;
      if(nums[mid]==target) return mid;
      if(nums[mid]<target){
        left=mid;
      }else{
        right =mid;
      }
    }
  }
}

class Solution {
  public int searchInsert(int[] nums, int target) {
    if(nums == null || nums.length == 0) return 0;

    int left = 0;
    int right = nums.length-1;

    while(left+1<right){
      int mid = left +(right-left)/2;
      if(nums[mid]==target) return mid;

      if(nums[mid]<target){
        left = mid;
      }else{
        right = mid;
      }
    }

    if(nums[left]>=target){
      return left;
    }else if(nums[left]<target && target<=nums[right]){
      return right;
    }else{
      return nums.length;
    }
  }
}