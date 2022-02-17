import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left 
to right, then right to left for the next level and alternate between).

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
*/
class Solution {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> res = new ArrayList<>();
      if(root ==null) return res;
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);

      boolean left2Right = true;

      while(!queue.isEmpty()){
        int size = queue.size();
        List<Integer> level = new ArrayList<>();

        for(int i=0; i<size; i++){
          TreeNode curr = queue.poll();
          if(left2Right){
            level.add(curr.val);
          }else{
            level.add(0, curr.val);
          }
          if(curr.left !=null) queue.add(curr.left);
          if(curr.right!=null) queue.add(curr.right);
        }
        res.add(level);
        left2Right=!left2Right;
      }
      return res;
  }
}