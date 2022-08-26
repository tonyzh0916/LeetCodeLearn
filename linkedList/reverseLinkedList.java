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
}
