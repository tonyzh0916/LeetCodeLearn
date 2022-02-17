import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, 
level by level).

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
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
  public List<List<Integer>> levelOrder(TreeNode root) {
      if(root ==null) return new ArrayList<>();
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);

      List<List<Integer>> res = new ArrayList<>();
      while(!queue.isEmpty()){
        int size = queue.size();
        List<Integer> level = new ArrayList<>();
        for(int i=0; i<size;i++){
          TreeNode curr = queue.poll();
          level.add(curr.val);
          if(curr.left !=null) queue.offer(curr.left);
          if(curr.right!=null) queue.offer(curr.right);
        }
        res.add(level);
      }
      return res;
  }
}