import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 
Constraints:

1 <= nums.length <= 8
-10 <= nums[i] <= 10
*/
class Solution {
  public List<List<Integer>> permuteUnique(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
      Arrays.sort(nums);
      helper(res, nums, new ArrayList<>(), new HashSet<>());
      return res;
  }
  
  private void helper(List<List<Integer>> res, int[] nums, List<Integer> temp, 
                      HashSet<Integer> visited){
      if(temp.size()==nums.length){
          res.add(new ArrayList<>(temp));
          return;
      }
      
      for(int i =0; i<nums.length; i++){
          if(visited.contains(i)) continue;
          if(i>0 && nums[i]==nums[i-1] && !visited.contains(i-1)) continue;
          temp.add(nums[i]);
          visited.add(i);
          helper(res, nums, temp, visited);
          temp.remove(temp.size()-1);
          visited.remove(i);
      }
  }
}