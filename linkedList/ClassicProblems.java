// Reverse a singly linked list.
// Example:
// Input: 1->2->3->4->5->NULL
// Output: 5->4->3->2->1->NULL
class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode curr = head;

    while(curr!=null){
      ListNode temp = curr.next;
      curr.next = pre;
      pre = curr;
      curr = nextTemp;
    }
    return pre;
  }
}

// Remove all elements from a linked list of integers that have value val.
// Example:
// Input:  1->2->6->3->4->5->6, val = 6
// Output: 1->2->3->4->5
class Solution {
  public ListNode removeElements(ListNode head, int val) {
  ListNode dummy = new ListNode(0);
  dummy.next = head;
  ListNode pointer = dummy;

  while(pointer.next!=null){
    if(pointer.next.val==val){
      ListNode nextNode = pointer.next;
      pointer.next = nextNode.next;
      pointer.next = pointer.next.next;
    }else{
      pointer =pointer.next;
    }
  }
  return dummy.next ;
}
}

// Given a singly linked list, group all odd nodes together followed by the even nodes. Please 
// note here we are talking about the node number and not the value in the nodes.
// You should try to do it in place. The program should run in O(1) space complexity and O(nodes) 
// time complexity.

// Example 1:

// Input: 1->2->3->4->5->NULL
// Output: 1->3->5->2->4->NULL
public class Solution {
  public ListNode oddEvenList(ListNode head) {
    if(head ==null ) return null;
    ListNode odd = head, even=odd.next, evenHead = even;
    while(even!=null && even.next !=null ){
      odd.next = even.next;
      odd = odd.next;
      even.next = odd.next;
      even = even.next;
    }
    odd.next = evenHead;
    return head;
  }
}