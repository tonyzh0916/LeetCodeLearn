class Solution {
  public boolean isSymmetric(TreeNode root) {
    if(root == null) return true;
    return helper(root.left, root.right);
  }

  public boolean helper(TreeNode left, TreeNode right){
    if(left && right) return true;
    if(left || right) return false;

    if(left.val != right.val) return false;

    return helper(left.left, right.right) && helper(left.right, right.left);
  }
}
