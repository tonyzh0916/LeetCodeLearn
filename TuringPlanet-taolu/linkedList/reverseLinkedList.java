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

/////

