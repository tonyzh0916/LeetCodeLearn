class Solution{
  public boolean isValidBST(TreeNode root){
    if(root == null) return true;
    return helper(root.left, Long.MIN_VALUE, root.val) && helper(root.right, root.val, Long.MAX_VALUE);
  }

  public boolean helper(TreeNode root, long min, long max){
    if(root == null) return true;
    if(root.val<=min || root.val>=max ) return false;
    return helper(root.left, min, root.val) && helper(root.right, root.val, max);
  }
}