class Solution{
  public ListNode reverse(ListNode head){
    if(head ==null || head.next == null){
      return head;
    }
    ListNode reverse_head = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return reverse_head;
  }


  public ListNode reverse2(ListNode head){
    if(head ==null || head.next == null){
      return head;
    }

    ListNode reversed_head = reverse2(head.next);
    head.next.next = head;
    head.next=null;
    return reversed_head;
  }

  public ListNode reverse3(ListNode head){
    if(head == null || head.next == null){
      return head;
    }

    ListNode reversed_head = reverse3(head.next);
    head.next.next = head;
    head.next = null;
    return reversed_head;
  }
}


