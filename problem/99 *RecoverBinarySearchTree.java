/*
You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. 
Recover the tree without changing its structure.

Example 1:


Input: root = [1,3,null,null,2]
Output: [3,1,null,null,2]
Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.
Example 2:


Input: root = [3,1,4,null,null,2]
Output: [2,1,4,null,null,3]
Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid.
 
Constraints:

The number of nodes in the tree is in the range [2, 1000].
-231 <= Node.val <= 231 - 1
*/
public class Solution {
    
  TreeNode firstElement = null;
  TreeNode secondElement = null;
  // The reason for this initialization is to avoid null pointer exception in the first comparison when prevElement has not been initialized
  TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);
  
  public void recoverTree(TreeNode root) {
      
      // In order traversal to find the two elements
      traverse(root);
      
      // Swap the values of the two nodes
      int temp = firstElement.val;
      firstElement.val = secondElement.val;
      secondElement.val = temp;
  }
  
  private void traverse(TreeNode root) {
      
      if (root == null)
          return;
          
      traverse(root.left);
      
      // Start of "do some business", 
      // If first element has not been found, assign it to prevElement (refer to 6 in the example above)
      if (firstElement == null && prevElement.val >= root.val) {
          firstElement = prevElement;
      }
  
      // If first element is found, assign the second element to the root (refer to 2 in the example above)
      if (firstElement != null && prevElement.val >= root.val) {
          secondElement = root;
      }        
      prevElement = root;

      // End of "do some business"

      traverse(root.right);
}
}




//////////////////////
public class Solution {
  public void recoverTree(TreeNode root) {
      List<TreeNode> eNodes = new LinkedList<TreeNode>(); //error nodes
      if(root == null) return;
      TreeNode current = root;
      TreeNode pre;
      TreeNode previous = null;
      while(current != null){
          
          if(current.left == null){
              
              if(previous!=null && previous.val > current.val){
                  eNodes.add(previous);
                  eNodes.add(current);
              }
              previous = current;
              current = current.right;
              
          }else{
              pre = current.left;
              while(pre.right != null && pre.right.val != current.val){
                  pre = pre.right;
              }
              
              if(pre.right == null){
                  pre.right = current;
                  current = current.left;
              }else {
                  if(previous!=null && previous.val > current.val){
                      eNodes.add(previous);
                      eNodes.add(current);
                  }
                  
                  pre.right = null;
                  previous = current;
                  current = current.right;
              }
          }
      }
      
      //this is redundant check
      //if(eNodes.size() == 0) return;
      
      if(eNodes.size() == 2){
          pre = eNodes.get(0);
          current = eNodes.get(1);
      }else{ //this case where eNodes.size()==4
          pre = eNodes.get(0);
          current = eNodes.get(3);
      }
      
      int temp = pre.val;
      pre.val = current.val;
      current.val = temp;
  }
}