/* 270
Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
Note:

Given target value is a floating point.
You are guaranteed to have only one unique value in the BST that is closest to the target.
Example:

Input: root = [4,2,5,1,3], target = 3.714286
    4
   / \
  2   5
 / \
1   3

Output: 4
*/

class Solution{
  public int closestValue(TreeNode root, double target){
    int result = root.val;
    while(root !=null){
      //用result 和 新的root 对比 如果小于 就更新result
      if(Math.abs(target-root.val)<Math.abs(target-ret)){
        result = root.val;
      }
      root = root.val>target?root.left : root.right;
    }
    return result;
  }
}

/////////// Need to take care of the double value like double 8= 8.000000000000012;
class Solution{
  public int closestValue(TreeNode root, double target){
    int result = root.val;
    while(root!=null){
      double diff = Math.abs(target-root.val);
      if(diff<1e-10){
        return root.val;
      }
      if(diff<Math.abs(result-target)){
        result = root.val;
      }
      root = root.val>target?root.left:root.right;
    }
    return ret;
  }
}


// worst   O(n)  prepare for the peek time
// ?average O(log(n))
// best    O(1)