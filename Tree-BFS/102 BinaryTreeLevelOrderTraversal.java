public List<List<Integer>> levelOrder(TreeNode root){
  List<List<Integer>> res = new ArrayList<>();
  if(root ==null){
    return null;
  }

  Queue<TreeNode> queue = LinkedList<>();
  queue.offer(root);

  while(!queue.isEmpty()){
    int size = queue.size;
    List<Integer> level = new ArrayList<>();
    for(int i=0; i<size ; i++){
      TreeNode cur =  queue.poll();
      level.add(cur.val);
      if(cur.left !=null){
        queue.offer(cur.left);
      }
      if(cur.right!=null){
        queue.offer(cur.right);
      }
    }
    res.add(level);
  }
  return res;
}
