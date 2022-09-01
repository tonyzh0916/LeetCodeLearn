class Solution{
int max =  Integer.MIN_VALUE;
public int maxPathSum(TreeNode root){
  dfs(root);
  return max;
  }
private int dfs(TreeNode node){
  if(node ==null){
    return 0;
  }

  int left = dfs(node.left);
  int right = dfs(node.right);
  left = left<0?0:left;
  right = right <0?0:right;
  max = Math.max(max, left+right+node.val);
  return Math.max(left+node.val, right+node.val);
  }
}

