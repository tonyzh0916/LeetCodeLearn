//Find First and Last Position of Element in Sorted Array
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

class Solution {
  public int[] searchRange(int[] nums, int target) {
      int[] result = new int[2];
      result[0]=findLeftNum(nums, target);
      result[1]=findRightNum(nums,target);
      return result;
  }
  
  public int findLeftNum(int[] nums, int target){
      int index=-1;
      int left=0;
      int right=nums.length-1;
      while(left<=right){
          int mid = left+(right-left)/2;
          if(nums[mid]>=target){
              right=mid-1;
          }else{
              left=mid+1;
          }
      if(nums[mid]==target) index=mid;  
      }
      return index;
  }
  
      public int findRightNum(int[] nums, int target){
      int index=-1;
      int left=0;
      int right=nums.length-1;
      while(left<=right){
          int mid = left+(right-left)/2;
          if(nums[mid]<=target){
              left=mid+1;
          }else{
              right=mid-1;
          }
          if(nums[mid]==target) index=mid;
      }
      return index;
  }
}