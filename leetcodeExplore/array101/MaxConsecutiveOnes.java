/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

class Solution {  //submitted
  public int findMaxConsecutiveOnes(int[] nums) {
      if(nums.length<=0){
          return 0;
      };
      int count = 0;
      int max =0;
      for(int num : nums){
          if(num==1){
              count++;
              max= Math.max(count, max);
          }else{
              count=0;
          }
      }
      return max;
  }
}

class Solution {  //submitted
  public int findMaxConsecutiveOnes(int[] nums) {
    int count=0, max=0;
    for(int num : nums){
      count = (num==0)?0:count++;
      max = Math.max(res, count);
    }
    return max;
  }
}

class Solution {//submitted
  public int findMaxConsecutiveOnes(int[] nums) {
      int sum = 0, res = 0;
      for (int num : nums) {
          sum = (sum + num) * num;
          res = Math.max(res, sum);
      }
      return res;
  }
}