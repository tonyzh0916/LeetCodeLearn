/*
Given the head of a linked list, rotate the list to the right by k places.

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:

Input: head = [0,1,2], k = 4
Output: [2,0,1]
 
Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
*/


class Solution {
  public class ListNode {
    int val;
   ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
  public ListNode rotateRight (ListNode head, int n){
    if(head==null || n==0) return head;

    ListNode index = head;
    int len =1;
    while(index.next!=null){
      len++;
      index = index.next;
    }

    index.next = head; //connect head with end
    n=n%len;
    for(int i=0; i<len-n;i++){
      head=head.next;
    }
    ListNode res  = head.next;
    head.next = null;
    return res;
  }
}