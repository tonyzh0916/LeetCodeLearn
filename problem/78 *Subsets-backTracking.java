import java.util.ArrayList;
import java.util.List;

/*
8246 134
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
*/
class Solution {
  public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
      helper(res, nums, 0, new ArrayList<>());
      return res;
  }
  private void helper(List<List<Integer>> res, int[] nums, int index, List<Integer> temp){
    res.add(new ArrayList<Integer>(temp));
    for(int i=index; i<nums.length; i++){
      temp.add(nums[i]);
      helper(res, nums, i+1, temp);
      temp.remove(temp.size()-1);
    }
  }
}