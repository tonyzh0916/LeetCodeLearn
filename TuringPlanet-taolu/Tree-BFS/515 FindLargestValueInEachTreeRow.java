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
    public List<Integer> largestValues(TreeNode root) {
       
        List<Integer> res =  new ArrayList<>();
         if(root ==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size = queue.size();
           // List<Intrger> level = new ArrayList<>();
            int curValue =Integer.MIN_VALUE;
                for(int i=0; i<size; i++){
                    TreeNode cur = queue.poll();
                    if(cur.val>curValue){
                        curValue =cur.val;
                    }
                    if(cur.left !=null){
                        queue.offer(cur.left);
                    }
                    if(cur.right !=null){
                        queue.offer(cur.right);
                    }
                }
            res.add(curValue);
        }     
        return res;
    }
}