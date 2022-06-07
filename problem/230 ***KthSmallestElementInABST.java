import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * 
 * Given the root of a binary search tree, and an integer k, 
 * return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 //inorder 

class Solution {
  public int kthSmallest(TreeNode root, int k) {
      Stack<TreeNode> stack = new Stack<>();

      while(true){
        while(root!=null){
          stack.push(root);
          root = root.left;
        }
        root = stack.pop();
        if(--k==0) return root.val;

        root = root.right;
      }
  }
}