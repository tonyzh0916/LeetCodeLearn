import java.util.PriorityQueue;

class Solution{
  public ListNode mergeKlists(ListNode[] lists){
    PriorityQueue<ListNode> heap = new  PriorityQueue<>((a, b)->a.val - b.val);
    for(ListNode list : lists){
      if(list!=null){
        heap.offer(list);
      }
    }

    ListNode res =new ListNode(0),
    cur = res;
    while(!heap.isEmpty()){
      ListNode top = heap.poll();
      cur.next = top;
      cur = cur.next;
      if(top.next!=null){
        heap.offer(top.next);
      }
    }
  }
  return res.next;
}

