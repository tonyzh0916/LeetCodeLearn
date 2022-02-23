import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. 
(i.e., from left to right, level by level from leaf to root).

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[15,7],[9,20],[3]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
*/
class Solution {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> res = new ArrayList<>();
      if(root==null) return res;

      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);
      while(!queue.isEmpty()){
        int size = queue.size();
        ArrayList<Integer> curr = new ArrayList<>();
        for(int i=0; i<size;i++){
          TreeNode temp = queue.poll();
          curr.add(temp.val);
          if(temp.left !=null){
            queue.offer(temp.left);
          }
          if(temp.right!=null){
            queue.offer(temp.right);
          }
        }
        res.add(0,curr);
      }
      return res;
  }
}
