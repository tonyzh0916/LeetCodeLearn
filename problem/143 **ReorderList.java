/*
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 

Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public void reorderList(ListNode head) {
      if(head == null) return;

      ListNode mid = findMid(head);
      ListNode l2 = mid.next;
      mid.next = null;
      l2=reverse(l2);
      ListNoe l1 = head;
      while(l1!=null && l2!=null){
        ListNode next = l1.next;
        l1.next = l2;
        l1.next.next = next;
        l1=next;
      }
  }

  public ListNode findMid(ListNode head){
    ListNode fast = head;
    ListNode slow = head;
     while(fast!=null && slow!=null){
       fast = fast.next.next;
       slow = slow.next;
     }
     return slow;
  }
  public ListNode reverse(ListNode head){
    ListNode newHead = null;
    while(head!=null){
      ListNode next = head.next;
      head.next = newHead;
      newHead = head;
      head = next;
    }
    return newHead;
  }

}
