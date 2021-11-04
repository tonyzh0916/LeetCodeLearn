/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], 
nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 
Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
*/

class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
      List<List<Integer>> res = new ArrayList<>();
      Arrays.sort(nums);
      
      for(int i=0; i<nums.length-3;i++){
          if(i!=0 && nums[i]==nums[i-1]) continue;
          for(int j=i+1; j<nums.length-1; j++){
              if(j!=i+1 && nums[j]==nums[j-1]) continue;
              
              int left = j+1;
              int right = nums.length-1;
              
              while(left < right){
                  int sum = nums[i]+nums[j]+nums[left]+nums[right];
                  
                  if(sum ==target){
                      res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                      
                      while(left+1 < right && nums[left+1] == nums[left]) left++;
                      while(right-1>left && nums[right] == nums[right-1]) right--;
                      left++;
                      right--;
                  }else if(sum > target){
                      right--;
                  }else if(sum<target){
                      left++;
                  }
              }
          }
      }
      return res;
  }
}