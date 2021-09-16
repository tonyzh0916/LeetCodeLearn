/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:

Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
Example 4:


Input: root = [1,2]
Output: [1,2]
Example 5:


Input: root = [1,null,2]
Output: [1,2]
 
Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 
Follow up: Recursive solution is trivial, could you do it iteratively?
*/

public class Solution{
  public List<Integer> preorderTraversal(TreeNode root){
    List<Integer> ret = new ArrayList<Integer>();
    rec(root, ret);
    return ret;
  }

  public void rec(TreeNode root, List<Integer> ret){
    if(root ==null){
      return ;
    }
    ret.add(root.val);
    rec(root.left, ret);
    rec(root.right, ret);
  }
}

/////////////////////////////////////////////////////
public List<Integer> preorderTraversal2(TreeNode root){
  List<Integer> ret = new ArrayList<Integer>();
  if(root ==null){
    return ret;
  }

  Stack<TreeNode> s = new  Stack<TreeNode>();
  s.push(root);

  while(!s.isEmpty()){
    TreeNode cur = s.pop();
    ret.add(cur.val);

    if(cur.right !=null){
      s.push(cur.right);
    }

    if(cur.left !=null){
      s.push(cur.left);
    }
  }
  return ret;
}
