/*
1->2->10
   |
   3-4-5-6     =====>  1,2,3,4,7,8,9,5,6,10
     |
     7-8-9
*/

ListNode flatten(ListNode cur){
  if(cur.down!=null){
    ListNode down=cur.down;
    ListNode next = cur.next;
    ListNode tail = flatten(cur.down);
    cur.down = null;
    cur.next = down;
    tail.next = next;
  }

  if(cur.next == null){
    return cur;
  }

  return flatten(cur.next);
}