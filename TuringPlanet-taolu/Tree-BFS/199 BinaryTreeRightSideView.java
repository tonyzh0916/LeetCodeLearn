public List<Integer> rightSideView(TreeNode root){
  if(root ==null){
    return null;
  }

  List<Integer> res = new ArrayList<>();
  Queue<TreeNode> queue = new LinkedList<>();

  queue.offer(root);

  while(!queue.isEmpty()){
    int size = queue.size();
    res.add(queue.peek().val);
    for(int i=0; i<size; i++){
      TreeNode curr = queue.poll();
      if(curr.right!=null){
        queue.offer(right.val);
      }
      if(curr.left !=null){
        queue.offer(cur.left);
      }
    }
  }
  return res;
}
