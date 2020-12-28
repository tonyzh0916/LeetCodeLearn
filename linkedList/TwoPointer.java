// Given head, the head of a linked list, determine if the linked list has a cycle in it.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously 
// following the next pointer. Internally, pos is used to denote the index of the node that tail
//  next pointer is connected to. Note that pos is not passed as a parameter.

// Return true if there is a cycle in the linked list. Otherwise, return false.
// Example 1:
// Input: head = [3,2,0,-4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

public class Solution {
  public boolean hasCycle(ListNode head) {
    if(head ==null){
      return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    while(slow!=fast){
      if(fast==null || fast.next==null){
        return false;
      }else{
        slow = slow.next;
        fast = fast.next.next;
      }
    }
    return true;
  }
}

// write a program to find the node at which the intersection of two singly linked lists begins.
// Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
// Output: Reference of the node with value = 8
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA==null || headB==null) return null;

    ListNode pointer_A = headA;
    ListNode pointer_B = headB;

    while(pointer_A!=pointer_B){
      if(pointer_A==null){
        pointer_A=headB;
      }else{
        pointer_A=pointer_A.next;
      }

      if(pointer_B==null){
        pointer_B=headA;
      }else{
        pointer_B=pointer_B.next;
      }
    }
    return pointer_A;
      }
  }

// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Follow up: Could you do this in one pass?
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      if(head==null) return null;
      ListNode pointer = head;
      int size =0;
      int needToRemove=-1;
      while(pointer!=null){
          size++;
          pointer=pointer.next;
      }
      if(size==1){
          head=null;
          return head;
      }else if(size==2 && n==1){
          head.next=null;
          return head;
      }else if(size == 2 && n==2){
          return head.next;
      }
      needToRemove=size-n;
      if(needToRemove ==0){
          head=head.next;
          return head;
      }else{
            pointer=head;
          for(int i=0; i<needToRemove-1;i++){
              pointer = pointer.next;
          }
          pointer.next = pointer.next.next;
      }
      return head;
  }
}