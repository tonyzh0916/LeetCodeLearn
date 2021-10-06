/*
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is 
the inorder traversal of the same tree, construct and return the binary tree.

Example 1:
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
Example 2:

Input: preorder = [-1], inorder = [-1]
Output: [-1]
 
Constraints:

1 <= preorder.length <= 3000
inorder.length == preorder.length
-3000 <= preorder[i], inorder[i] <= 3000
preorder and inorder consist of unique values.
Each value of inorder also appears in preorder.
preorder is guaranteed to be the preorder traversal of the tree.
inorder is guaranteed to be the inorder traversal of the tree.
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
class Solution {
  public TreeNode buildTree(int[] preorder, int[] inorder) {
      HashMap<Integer, Integer> map =new HashMap<>();
      
      for(int i=0; i<inorder.length; i++){
          map.put(inorder[i], i);
      }
      
      return helper(preorder, inorder, 0, 0, inorder.length-1, map);
  }
  
  private TreeNode helper(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd,
                           HashMap<Integer, Integer> map){
      if(preStart>= preorder.length || inStart>inEnd) return null;
      
      TreeNode root = new TreeNode(preorder[preStart]);
      
      int rootIndex = map.get(preorder[preStart]);
      
      root.left  = helper(preorder, inorder, preStart+1, inStart, rootIndex-1, map);
      root.right = helper(preorder, inorder, preStart+rootIndex-inStart+1, rootIndex+1, inEnd, map);
      
      return root;
  } 
}