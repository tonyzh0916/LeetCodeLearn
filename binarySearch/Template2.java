//First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left=1;
            int right=n;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(isBadVersion(mid)==true) {
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            return left;
        }
    }

    ///////////////////////
    //Find Peak Element
    class Solution {
      public int findPeakElement(int[] nums) {
          int left=0;
          int right= nums.length-1;
          while(left+1<right){
              int mid= left+(right-left)/2;
              if(nums[mid]>nums[mid+1]){
                  right=mid;
              }else{
                  left=mid;
              }
          }
          if(nums[left]>nums[right]){
              return left;
          }else{
              return right;
          }
      }
  }

  //soluton 2
  class Solution {
    public int findMin(int[] nums) {
        return findMin(nums,0,nums.length-1);
    }
    private int findMin(int[] nums, int left, int right){
        if(left+1>=right) return Math.min(nums[left], nums[right]);
        if(nums[left]<nums[right]) return nums[left];
        int mid = left+(right-left)/2;
        return Math.min(findMin(nums,left, mid-1), findMin(nums, mid,right));
    }
}