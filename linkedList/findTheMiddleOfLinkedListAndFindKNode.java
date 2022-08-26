
class Solution{
    public ListNode linkedlistMiddleNode(ListNode head){
    ListNode i= head, j=head;

    while(j!=null && j.next!=null){
      i=i.next;
      j=j.next.next;
    }
    return i;
  }

  public ListNode linkedlistLastKthNode(ListNode head, int k){
    ListNode i = head, j = head;
    for(int c=0; c<k ;c++){
      j=j.next;
    }
    while(j!=null){
      i=i.next;
      j=j.next;
    }
    return  i;
  }
}

