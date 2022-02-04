import org.omg.CORBA.NO_MEMORY;

/*
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the 
resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, 
[0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not 
in nums.

You must decrease the overall operation steps as much as possible.

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
 
Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
nums is guaranteed to be rotated at some pivot.
-104 <= target <= 104
*/
class Solution {
  public boolean search(int[] nums, int target) {
      if(nums==null || nums.length==0) return false;
      int left=0;
      int right =nums.length-1;
      
      while(left+1<right){
        int mid = left + (right-left)/2;
        if(nums[mid]==target){
          return true;
        }
        if(nums[mid]==nums[right]){
          right--;
        }else if(nums[mid]==nums[left]){
          left++;
        }else if(nums[left]<nums[mid]){
          if(nums[left]<=target && target<=nums[mid]){
            right = mid;
          }else{
            left=mid;
          }
        }else if(nums[mid]<nums[right]){
          if(nums[mid]<=target && target <=nums[right]){
            left = mid;
          }else{
            right = mid;
          }
        }
      }

      if(nums[left]==target || nums[right]==target){
        return true;
      }else{
        return false;
      }
  }
}

////////////////
class Solution2{
  public boolean search(int[] nums, int target) {
    if(nums.length==0 || nums==null) return false;
    int left = 0;
    int right = nums.length-1;

    while(left+1<right){
      int mid = left+(right-left)/2;
      if(target==nums[mid]){
        return true;
      }
      if(nums[mid]==nums[right]){
        right--;
      }else if(nums[mid]==nums[left]){
        left++;
      }else if(nums[left]<nums[mid]){
        if(nums[left]<=target && nums[mid]>=target){
          right = mid;
        }else{
          left = mid;
        }
      }else if(nums[right]>nums[mid]){
        if(nums[mid]<=target && nums[right]>=target){
          left = mid;
        }else{
          right=mid;
        }
      }
    }
    if(nums[left]==target || nums[right]==target){
      return true;
    }else{
      return false;
    }

  }
}