//Sqrt(x)
class Solution {
  public int mySqrt(int x) {
      int left=1; int right=x;
          while(left<=right){
              int mid = left+(right-left)/2;
              if(mid>x/mid){
                 right=mid-1; 
              } else{
                 left=mid+1; 
              }
          }
      return right;
  }
}


///////////////////////
//Guess Number Higher or Lower
public class Solution extends GuessGame {
  public int guessNumber(int n) {
      int left=1;
      int right=Integer.MAX_VALUE;
      while(left<=right){
          int mid= left+(right-left)/2;
          if(guess(mid)==0) return mid;
          if(guess(mid)==-1) {right=mid-1; }
          if(guess(mid)==1)  {left= mid+1; }
          }
          return -1;
      }
  }

  ///////////////////////////
  ////Search in Rotated Sorted Array

  class Solution {
    public int search(int[] nums, int target) {
        if(nums==null || nums.length==0) return -1;
        int left=0; int right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid; 
            }else if(nums[mid]<nums[left]){
                if(target>nums[mid] && target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }else{
                if(target<nums[mid]&& target>=nums[left]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            
        }
        return -1;
    }
}
