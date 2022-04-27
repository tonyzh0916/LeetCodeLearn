import java.util.Stack;

import javax.swing.tree.TreeNode;

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
class BSTIterator {

  private TreeNode cur;
  private Stack<TreeNode> stack;

  public BSTIterator(TreeNode root) {
      cur = root;
      Stack = new Stack<>();
  }
  
  //return the next smallest number
  public int next() {
    while(cur!=null){
      stack.push(cur);
      cur = cur.left;
    }

    cur = stack.pop();
    int val = cur.val;
    cur = cur.right;
    return val;
  }
  
  //return whetherr we have a next smallest number
  public boolean hasNext() {
    if(!stack.isEmpty()|| cur !=null){
      return true;
    }else{
      return false;
    }
  }
}

/**
* Your BSTIterator object will be instantiated and called as such:
* BSTIterator obj = new BSTIterator(root);
* int param_1 = obj.next();
* boolean param_2 = obj.hasNext();
*/