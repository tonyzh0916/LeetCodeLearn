import java.util.List;
import java.util.Queue;

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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        boolean left2right = true;
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();

            for(int i=0; i<size; i++){
                TreeNdoe cur = queue.poll();
                if(left2right==true){
                     level.add(cur.val)
                }else{
                    level.add(0, cur.val);
                }
               
                if(cur.left !=null) queue.add(cur.left);
                if(cur.right !=null) queue.add(cur.right);
            }
            res.add(level);
            left2right = !left2right;
        }
        return res;


    }
}