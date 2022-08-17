int sum = 0;
public int  sumNumbers(TreeNode root){
  if(root ==null){
    return 0;
  }
  dfs(root , 0);
  return sum;
}

private void dfs(TreeNode root, int num){
  num = num*10 + root .val;
  if(root.left ==  null && root.right==null){
    sum += num;
    return;
  }
  if(root.left !=null){
    dfs(root.left, num);
  }
  if(root.right !=null){
    dfs(root.right, num);
  }
}
