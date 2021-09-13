/*[LeetCode] 61. Rotate List 旋转链表
Given the head of a linked list, rotate the list to the right by k places.

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 
Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
 
这道旋转链表的题和之前那道 Rotate Array 很类似，但是比那道要难一些，因为链表的值不能通过下表来访问，只能一个一个的走，
博主刚开始拿到这题首先想到的就是用快慢指针来解，快指针先走k步，然后两个指针一起走，当快指针走到末尾时，慢指针的下一个位置是新的顺序的头结点，
这样就可以旋转链表了，自信满满的写完程序，放到 OJ 上跑，以为能一次通过，结果跪在了各种特殊情况，首先一个就是当原链表为空时，直接返回NULL，
还有就是当k大于链表长度和k远远大于链表长度时该如何处理，需要首先遍历一遍原链表得到链表长度n，然后k对n取余，这样k肯定小于n，
就可以用上面的算法
*/

public ListNode rotateRight(ListNode head, int n){
  if(head ==null || head.next ==null || n==0){
    return head;
  }

  ListNode fast=head, slow=head, countLen = head;
  ListtNode newHead = new ListNode(-1);
  int len=0;
  
  while(countLen!=null){
    len++;
    countLen=countLen.next;
  }

  n=n%len;

  for(int  i=0; i<n; i++){
    fast=fast.next;
  }

  while(fast.next!=null){
    slow=slow.next;
    fast=fast.next;
  }

  newHead = slow.next;
  fast.next= head;
  slow.next =null;

  return newHead;
}

public ListNode rotateRight (ListNode head, int n){
  if(head==null || n==0){
    return head;
  }
  ListNode p = head;
  int  len =1;

  while(p.next!=null){
    len++;
    p=p.next;
  }

  p.next=head;
  n=n%len;
  for(int i=0; i<len-n;i++){
    p=p,next;
  }
  head = p.next;
  p.next=null;
  return head;
}