class Solution {
  public ListNode partition(ListNode head, int x) {
      ListNode dummy1 = new ListNode(0);
      ListNode curr1 = dummy1;
      ListNode dummy2 = new ListNode(0);
      ListNode curr2 = dummy2;

      while(head!=null){
        ListNode temp = new ListNode(head.val);
        if(head.val<x){
          curr1.next = temp;
          curr1=curr1.next;
        }else{
          curr2.next=temp;
          curr2 = curr2.next;
        }
        head = head.next;
      }
      curr1.next = dummy2.next;
      return dummy1.next;
  }
}
