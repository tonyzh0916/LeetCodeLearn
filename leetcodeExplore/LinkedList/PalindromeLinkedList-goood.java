/*
Given the head of a singly linked list, return true if it is a palindrome.
Example 1:

Input: head = [1,2,2,1]
Output: true
Example 2:

Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 

Follow up: Could you do it in O(n) time and O(1) space?
*/

class Solution {
  public boolean isPalindrome(ListNode head) {
    if(head == null){
        return true;
    }
      ListNode mid = getMid(head);
      ListNode midNext = reverse(mid.next);
      
      while(midNext !=null){
          if(head.val == midNext.val){
              head = head.next;
              midNext = midNext.next;
          }else{
              return false;
          }
      }
      return true;
  }
  
  private ListNode getMid(ListNode head){
      ListNode dummy = new ListNode(-1);
      dummy.next = head;
      
      ListNode slow = dummy;
      ListNode fast = dummy;
      
      while(fast!=null && fast.next!=null){
          slow = slow.next;
          fast = fast.next.next;
      }
      return slow;
  }
  
  private ListNode reverse(ListNode head){
      ListNode prev = null;
      ListNode curr = head;
      ListNode next = null;
      
      while(curr!=null){
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }
      return prev;
  }
}