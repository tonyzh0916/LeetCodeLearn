import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*abstractGiven an integer n, return all the structurally unique BST's (binary search trees), which has exactly n 
nodes of unique values from 1 to n. Return the answer in any order.

Example 1:

Input: n = 3
Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
Example 2:

Input: n = 1
Output: [[1]]
 
Constraints:

1 <= n <= 8
*/
class Solution {
  public List<TreeNode> generateTrees(int n) {
      if(n==0) return new ArrayList<>();
      return helper(1,n);
  }

  private List<TreeNode> helper(int start, int end){
    List<TreeNode> list = new ArrayList<>();

    if(start>end){
      list.add(null);
      return list;
    }

    for(int i=start ; i<=end; i++){
      List<TreeNode> leftNodes = helper(start, i-1);
      List<TreeNode> rightNodes = helper(i+1, end);

      for(TreeNode left : leftNodes){
        for(TreeNode right: rightNodes){
          TreeNode root = new TreeNode(i);
          root.left=left;
          root.right=right;
          list.add(root);
        }
      }
    }
    return list;
  }
}