public int maxDepth(TreeNode  root){
  if(root ==null){
    return 0;
  }

  int depth = 0;
  Queue<TreeNode> queue = new LinkedList<>();
  queue.offer(root);
  while(!queue.isEmpty()){
    int  size = queue.size;
    for(int i=0; i<size; i++){
      TreeNode cur = queue.poll();
      if(cur.left !=null){
        queue.offer(cur.left);
      }
      if(cur.right !=null){
        queue.offer(cur.right);
      }
    }
    depth++;
  }
  return depth;
  
}
///////////////////////
public int maxDepth2(TreeNode root){
  if(root == null){
    return  0;
  }
  int  depth =0;
  Queue<TreeNode> queue = new LinkedList<>();
  queue.offer(root);
  while(!queue.isEmpty()){
    int size = queue.size();
    for(int i=0; i<size; i++){
      TreeNode cur =  queue.poll();
      if(cur.left!=null){
        queue.offer(cur.left);
      }
      if(cur.right!=null){
        queue.offer(cur.right);
      }
    }
    depth++;
  }
  return depth;
}
