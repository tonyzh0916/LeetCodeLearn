package TuringPlanet-taolu.精华题目讲解;

public listNode removeNthFromEnd(ListNode head, int n){
    int len = 0;
    ListNode cur = head;
    while(cur!=null){
        cur = cur.next;
        len++
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    cur = dummy;
    for(int i=0; i<len-n ;i++){
        cur = cur.next;
    }

    cur.next = cur.next.next;
    return dummy.next;
}


/////////////////////////////////
public ListNode removeNthFromEnd2(ListNode head, int n){
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode slow = dummy, fast = dummy;
    for(int i=0; i<n;i++){
        fast = fast.next;
    }

    while(fast.next !=null){
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
    return dummy.head;
}
