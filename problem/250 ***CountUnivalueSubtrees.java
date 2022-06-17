import javax.print.attribute.standard.PrinterInfo;
import javax.swing.tree.TreeNode;

/*
 * Given the root of a binary tree, return the number of uni-value subtrees.

A uni-value subtree means all nodes of the subtree have the same value.

Example 1: image tooltip here

Input: root = [5,1,5,5,5,null,5]
Output: 4
Example 2:

Input: root = []
Output: 0
Example 3:

Input: root = [5,5,5,5,5,null,5]
Output: 6
 */
class Solution{
  int res =0;
  public int countUnivalSubtrees(TreeNode root){
    helper(root);
    return res;
  }

  private Boolean helper(TreeNode root){
    if(root == null) return true;

    Boolean left = helper(root.left);
    Boolean right = helper(root.right);

    if(left && right){
      if(root.left !=null root.left.val!=root.val){
        return false;
      }

      if(root.right !=null && root.right.val !=root.val){
        return false;
      }
        res+=1;

        return true;
      
    }
    return false;
  }
}