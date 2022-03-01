import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
Given the root of a binary tree, flatten the tree into a "linked list":

The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left 
child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.
 

Example 1:


Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [0]
Output: [0]
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100
*/
class Solution {
  public void flatten(TreeNode root) {
      if(root==null) return;

      Stack<TreeNode> stack = new Stack<>();
      stack.push(root);
      while(!stack.isEmpty()){
        TreeNode curr = stack.pop();
        if(curr.right!=null) stack.push(curr.right);
        if(curr.left !=null) stack.push(curr.left);

        if(!stack.isEmpty()){
          curr.right = stack.peek();
        }
        curr.left=null;
      }
  }
}