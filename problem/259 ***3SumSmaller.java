import java.util.Arrays;

/*
 * Given an array of n integers nums and an integer target, find the number of index triplets i, j, 
 * k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.

Follow up: Could you solve it in O(n2) runtime?

Example 1:

Input: nums = [-2,0,1,3], target = 2
Output: 2
Explanation: Because there are two triplets which sums are less than 2:
[-2,0,1]
[-2,0,3]
Example 2:

Input: nums = [], target = 0
Output: 0
Example 3:

Input: nums = [0], target = 0
Output: 0
 */
class Solution{
  public int threeSumSmaller(int[] nums, int target){
    int res =0;
    Arrays.sort(nums);

    for(int i=0; i<nums.length; i++){
      int left = i+1;
      int right = nums.length-1;
      while(left<right){
        if(nums[i]+nums[left]+nums[right]<target){
          res+=right-left;
          left++;
        }else{
          right--; 
        }
      }
    }
    return res;
  }
}