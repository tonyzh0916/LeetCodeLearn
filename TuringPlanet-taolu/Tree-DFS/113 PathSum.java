import java.util.ArrayList;
import java.util.List;

class Solution{
  List<List<Integer>> res;

  public List<List<Integer> pathSum(TreeNode root, int targetSum){
    res = new ArrayList<>();
    helper(root, targetSum, new ArrayList<>());
    return res;
  }

  private void helper(TreeNode root, int sum, List<Integer> temp){
    if(root ==null) return;
    if(root.left ==null && root.right == null){
      if(root.val == sum ){
        temp.add(root.val);
        res.add(new ArrayList<>(temp));
        temp.remove(temp.size()-1);
      }
      helper(root.left, sum-root.val, temp);
      helper(root.right, sum-root.val, temp);
      temp.remove(temp.size()-1);
    }
  }
}
