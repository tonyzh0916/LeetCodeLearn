import java.util.ArrayList;
import java.util.List;

/*
Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].

You may return the answer in any order.

Example 1:

Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
Example 2:

Input: n = 1, k = 1
Output: [[1]]
 

Constraints:

1 <= n <= 20
1 <= k <= n

backtracking
*/
class Solution {
  public List<List<Integer>> combine(int n, int k) {
      int[] nums = new int[n];
      for(int i=0; i<n; i++){
        nums[i]=i+1;
      }

      List<List<Integer>> res = new ArrayList<>();
      helper(res, nums, new ArrayList<>(), 0,k);
      return res;
  }

  public void helper(List<List<Integer>> res, int[] nums, List<Integer> temp, int index, int count){
    if(count ==0){
      res.add(new ArrayList<>(temp));
      return;
    }

    for(int i=index; i<nums.length;i++){
      temp.add(nums[i]);
      helper(res, nums, temp, i+1, count-1);
      temp.remove(temp.size()-1);
    }
  }
}

