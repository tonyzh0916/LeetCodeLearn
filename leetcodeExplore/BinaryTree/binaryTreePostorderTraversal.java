/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.
*/

// https://www.cnblogs.com/yrbbest/p/4489571.html
//Recursive:
public class Solution {
  public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      postorderTraversal(res, root);
      return res;
  }
  
  private void postorderTraversal(List<Integer> res, TreeNode root) {
      if (root == null) return;
      postorderTraversal(res, root.left);
      postorderTraversal(res, root.right);
      res.add(root.val);
  }
}

//////////////
public class Solution {
  public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> res = new LinkedList<>();
      if (root == null) return res;
      Stack<TreeNode> stack = new Stack<>();
      stack.push(root);
      
      while (!stack.isEmpty()) {
          TreeNode node = stack.pop();
          if (node != null) {
              res.add(0, node.val);
              stack.push(node.left);
              stack.push(node.right);
          }
      }
      return res;
  }
}