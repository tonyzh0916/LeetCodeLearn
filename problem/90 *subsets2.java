import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
*/
class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
      if(nums==null || nums.length==0) return res;
      Arrays.sort(nums);
      helper(res, nums, 0, new ArrayList<>());
      return res; 
  }

  public void helper(List<List<Integer>> res, int[]nums, int index, List<Integer> temp){
    res.add(new ArrayList<>(temp));

    for(int i=index; i<nums.length;i++){
      if(i!=index && nums[i]==nums[i-1]) continue;
      temp.add(nums[i]);
      helper(res, nums, i+1, temp);
      temp.remove(temp.size()-1);
    }
  }
}
