import java.util.List;

class Solution {
  public ListNode removeElements(ListNode head, int val) {
      if(head ==null) return head;
      ListNode dummy = new ListNode(-1);
      dummy.next = head;
      ListNode pointer = dummy;
      while(pointer.next!=null){
          if(pointer.next.val == val){
              pointer.next = pointer.next.next;
          }else{
              pointer = pointer.next;
          }
      }
      return dummy.next;
  }
}

class solution2{
    public ListNode removeElements2(ListNode head, int val){
        if(head == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pointer = dummy;
        while(pointer.next !=null){
            if(pointer.next.val == val){
                pointer.next = pointer.next.next;
            }else{
                pointer=pointer.next;
            }
        }
        return dummy.next;
    }
}