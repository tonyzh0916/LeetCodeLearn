/*
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the 
lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Example 1:

Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.
Example 2:

Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [1,2], p = 1, q = 2
Output: 1
 
Constraints:
The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the tree.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       //这里是思考难点。定义规则：比如在某一棵子树上先找到了p，则无需继续遍历这棵子树，因为即使这棵子树有q，p也一定是q的祖先，也就是它们两个的最近公共祖先。
       if(null == root || root.val == p.val || root.val == q.val) return root;
       //按照上述规则，找到root的左子树的最近公共祖先。
       TreeNode left = lowestCommonAncestor(root.left, p, q);
       //按照上述规则，找到root的右子树的最近公共祖先。
       TreeNode right = lowestCommonAncestor(root.right, p, q);
       //一边找到了，一边没找到，根据上述规则，找到的就是最近公共祖先。
       if(null == left) return right;
       if(null == right) return left;
       //如果在左右子树分别找到了p和q，则说明root是它们两个的最近公共祖先。
       return root;
   }
}