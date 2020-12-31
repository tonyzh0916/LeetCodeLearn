// Binary Tree Preorder Traversal
class Solution {
List<Integer> result = ArrayList<Integer>();
public List<Integer> preorderTraversal(TreeNode root) {
  if(root==null) return result;
  result.add(root);
  preorderTraversal(root.left);
  preorderTraversal(root.right);
  return result;
}
}

// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
// For example:
// Given binary tree [3,9,20,null,null,15,7]
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList();
    if(root==null) return result;
    Queue<Integer> q = new Linkedlist();
    q.offer(root);
    while(!q.isEmpty()){
      int size = q.size();
      List<Integer> level = new ArrayList();
      for(int i=0; i<size; i++){
        TreeNode cur = q.poll();
        level.add(cur.val);
        if(cur.left!=null){
          q.add(cur.left);
        }
        if(cur.right!=null){
          q.add(cur.right);
        }
  
      }
      result.add(level);
    }
    return result;
  }
}