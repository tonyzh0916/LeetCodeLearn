import java.awt.List;
import java.util.ArrayList;

/*
Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the 
path equals targetSum. Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
Example 1:

Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: []
Example 3:

Input: root = [1,2], targetSum = 0
Output: []
 
Constraints:

The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
*/
class Solution {
  List<List<Integer>> res;
  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      res = new ArrayList<>();
      helper(root, targetSum, new ArrayList<>());
      return res;
  }

  private void helper(TreeNode root, int sum, List<Integer> temp){
    if(root==null) return ;
    if(root.left == null && root.right==null){
      if(root.val==sum){
        temp.add(root.val);
        res.add(new ArrayList<>(temp));
        temp.remove(temp.size()-1);
      }
      return;
    }
    temp.add(root.val);
    helper(root.left, sum-root.val,temp);
    helper(root.right, sum-root.val, temp);
    temp.remove(temp.size()-1);
  }
}