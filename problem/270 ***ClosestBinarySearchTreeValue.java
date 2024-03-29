import javax.swing.tree.TreeNode;

/*
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

Note:

Given target value is a floating point. You are guaranteed to have only one unique value in the BST that is closest to the target. Example:

Input: root = [4,2,5,1,3], target = 3.714286

    4
   / \
  2   5
 / \
1   3

Output: 4
 */

 class Solution
{
  public int closesValue(TreeNode root, double target){
    int res = root.val;
    while(root!=null){
      if(Math.abs(target-root.val < Math.abs(target-res))){
        res = root.val;
      }

      root = root.val>target?root.left : root.right;
    }
    return res;
  }
}

//////////////////////
class Solution2 {
  public int closestValue(TreeNode root, double target) {
    int res = root.val;
    while(root!=null){
      if(Math.abs(target-root.val)<Math.abs(target-res)){
        res = root.val;
      }
      root = root.val>target?root.left:root.right;
    }
    return res;
  }
}
