/*
 * Problem
Given a binary tree, find the length of the longest consecutive sequence path.

The path refers to any sequence of nodes from some starting node to any node in the tree along 
the parent-child connections. The longest consecutive path need to be from parent to child (cannot 
be the reverse).

Example 1:

Input:

   1
    \
     3
    / \
   2   4
        \
         5

Output: 3
Explanation: Longest consecutive sequence path is 3-4-5, so return 3. Example 2:

Input:

   2
    \
     3
    /
   2
  /
 1

Output: 2
Explanation: Longest consecutive sequence path is 2-3, not 3-2-1, so return 2.
 */
class Solution{
   int res =1;
   public  int longestConsecutive(TreeNode root){
      if(root = null ) return 0;
      helper(root, root.val, 0);
      return res;
   } 

   private int helper(TreeNode root, TreeNode cur, int count){
      if(root == null) return;
      if(root.val == cur){
         count++;
         res = Math.max(res, count);
         helper(root.left,  cur+1, count);
         helper(root.right, cur+1, count);
      }else{
         helper(root.left,  root.val+1, count);
         helper(root.right, root.val+1, count);
      }
   }
}