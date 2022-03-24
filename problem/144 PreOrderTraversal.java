class Solution{
  public List<Integer> res preorderTraversal(TreeNode root){
    List<Integer> res = new ArrayList<>();
    if(root == null) return res;

    helper(res, root);
    return res;
  }

  private void helper(List<Integer> res, TreeNode root){
    if(root ==null) return;
    res.add(root.val);
    helper(res, root.left);
    helper(res, root.right);
  }
}

/////////////////////
class Solution{
  public List<Integer> prreorderTraversal(TreeNode root){
    List<Integer> res = new ArrayList<>();
    if(root == null) return res;

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while(!stack.isEmpty()){
      TreeNode cur = stack.pop();
      if(curr.right !=null ) stack.push(cur.right);
      if(curr.left  !=null ) stack.push(cur.left);
      res.add(cur.val);
    }
    return res;
  }
}
