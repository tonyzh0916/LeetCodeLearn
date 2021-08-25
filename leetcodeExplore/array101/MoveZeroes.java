/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of 
the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 
Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/

class Solution {
  public  void moveZeroes(int[] nums) {
    int count =0;
    for(int i=0; i<nums.length;i++) {
      if(nums[i]!=0) {
        nums[count++]=nums[i];
      }
    }
    
    while(count<nums.length) {
      nums[count++]=0;
    }   
}
}

class Solution2 {
  public  void moveZeroes2(int[] nums) {
    for(int i=0; i<nums.length; i++) {
      if(nums[i]==0) {
        for(int j=i+1; j<nums.length;j++) {
          if(nums[j]!=0) {
            swift(i, j, nums);
                      break;
          }
        }
      }
    }
    
    System.out.println(Arrays.toString(nums));
      
  }
  
  public  void  swift(int i, int j, int[] arr) {
    int temp =  arr[i];
      arr[i]=  arr[j];
      arr[j] = temp;
  }
}