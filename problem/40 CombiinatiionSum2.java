/*
Given a collection of candidate numbers (candidates) and a target number (target), 
find all unique combinations in candidates where the candidate numbers sum to target.
Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 
Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30
*/
class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    helper(candidates, res, target, new ArrayList<Integer>(), 0);
    return res;
  }

  private void helper(int[] nums, List<List<Integer>> res, int target, List<Integer> temp, int start){
    if(target<0) return;
    if(target==0){
      res.add(new ArrayList<>(temp));
      return;
    }

    for(int i=start; i<nums.length; i++){
      if(i!=start && nums[i]==nums[i-1]) continue;
      temp.add(nums[i]);
      helper(nums, res, target-nums[i], temp, i+1);
      temp.remove(temp.size()-1);
    }
  }
}