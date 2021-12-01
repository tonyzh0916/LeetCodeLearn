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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;

    int carry = 0;

    while(l1!=null || l2!=null){
      //1, get the current number 
      int num1 = l1==null?0:l1.val;
      int num2 = l2==null?0:l1.val;

      //2. update the carry
      int sum = num1 + num2+ carry;
      curr.next = new ListNode(sum%10);
      carr = sum/10;

      //3 move to the next point
      curr = curr.next;
      if(l1 !=null){
        l1=l1.next;
      }

      if(l2!=null){
        l2=l2.next;
      }
    }

    if(carry!=0){
      curr.next = new ListNode(carry);
    }
    return dummy.next;
  }
}


class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(-1);
      ListNode cur = dummy;
      int count =0;
      while(l1!=null || l2 !=null){
          int d1 = l1 == null ? 0 : l1.val;
          int d2 = l2 == null ? 0 : l2.val;
          int sum = d1 + d2 + count;
          count = sum >= 10 ? 1 : 0;
          cur.next = new ListNode(sum % 10);
          cur = cur.next;
          if (l1 != null) l1 = l1.next;
          if (l2 != null) l2 = l2.next;
      };
      if(count==1) cur.next = new ListNode(1);
      return dummy.next;
  }
}


//-------------practice 11/30
public class ListNode{
  int val;
  ListNode next;
  ListNode() {};
  ListNode(int val){this.val = val;}
  ListNode(int val, ListNode next){this.val =val; this.next = next }
}

class Solution{
  public ListNode adddTwoNumbers(ListNode l1, ListNode l2){
    ListNode dummy = new ListNode(-1);
    ListNode cur = dummy;
    int count = 0;

    while(l1!=null || l2!=null){
      int d1 = l1==null?0:l1.val;
      int d2 = l2==null?0:l2.val;
      int sum = d1+d2+count;
      count = sum>=10?1:0;
      cur.next = new ListNode(sum%10);
      cur = cur.next;
      if(l1 !=null) l1=l1.next;
      if(l2 !=null) l2=l2.next; 
    };
    if(count ==1) cur.next = new ListNode(1);
    return dummy.next;
  }
}