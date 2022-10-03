class Solution{
    public ListNode linkedlistLastKthNode(ListNode head, int k) {
        ListNode i=head, j=head;
        for(int c=0; c<k; c++){
            j= j.next;
        }
        while(j!=null){
            i=i.next;
            j=j.next;
        }
        return i;
    }
}

class ListNode{
    int val;
    ListNode next;
}
