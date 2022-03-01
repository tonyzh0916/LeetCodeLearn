class Solution {
  public Node connect(Node root) {
      if(root == null) return root;

      Node curr = root;
      while(curr!=null){
        Node head = curr;
        while(curr !=null){
          if(curr.left !=null){
            curr.left.next = curr.right;
          }

          if(curr.right !=null && curr.next !=null){
            curr.right.next = curr.next.left;
          }

          curr = curr.next;
        }
        curr = head.left;
      }
      return root;
  }
}