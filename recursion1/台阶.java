//一个台阶总共n级 如果一次可以跳1级  也可以跳2级 总共有多少种跳法
class  soluction{
    public int solve(int n){
      if(n==1)  return 1;
      if(n==2)  return 2;

      return solve(n-1)+solve(n-2);
  }

    public int getTreeHeight(TreeNode root){
      if(root ==null) return 0;
      int left = getTreeHeight(root.left);
      int right =  getTreeHeight(root.right);
      return Math.max(left, right)+1;
    }
}
