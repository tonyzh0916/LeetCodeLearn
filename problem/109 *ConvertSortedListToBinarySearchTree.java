/*
Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of 
every node never differ by more than 1.

 

Example 1:


Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
Example 2:

Input: head = []
Output: []
 

Constraints:

The number of nodes in head is in the range [0, 2 * 104].
-105 <= Node.val <= 105
*/
class Solution {
  public TreeNode sortedListToBST(ListNode head) {
      if(head == null) return null;
      return helper(head, null);
  }

  private TreeNode helper(ListNode start, ListNode end){
    if(start == end) return null;

    ListNode slow = start;
    ListNode fast  = start.next;

    while(fast!=end && fast.next!=end){
      slow = slow.next;
      fast = fast.next.next;
    }
    TreeNode root = new TreeNode(slow.val);
    root.left =helper(start, slow);
    root.right = helper(slow.next, end);
    return root;
  }
}