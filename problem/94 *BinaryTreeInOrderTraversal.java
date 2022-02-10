/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.


Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  List<Integer> res;
  public List<Integer> inorderTraversal(TreeNode root) {
      res = new ArrayList<>();
      helper(root);
      return res;
  }

  private void helper(TreeNode root){
      if(root == null) return;

      helper(root.left);
      res.add(root.val);
      helper(root.right);
  }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      Stack<TreeNode> stack = new Stack<>();
      TreeNode curr = root;

      while(curr != null || !stack.isEmpty()){
          while(curr != null){
              stack.push(curr);
              curr = curr.left;
          }

          curr = stack.pop();
          res.add(curr.val);

          curr = curr.right;
      }

      return res;
  }
}