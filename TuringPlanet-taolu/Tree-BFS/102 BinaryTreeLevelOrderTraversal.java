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
/////////////////////////
public List<List<Integer>> levelOrder5(TreeNode root){
  List<List<Integer>> res = new ArrayList<>();
  if(root == null){
    return null;
  }
  Queue<TreeNode> queue = LinkedList<>();
  queue.offer(root);
  while(!queue.isEmpty()){
    int size = queue.size;
    List<Integer> level = new ArrayList<>();
    for(int i=0; i<size ;  i++){
      TreeNode cur = queue.poll();
      level.add(cur.val);
      if(cur.left !=null){
        queue.offer(cur.left);
      }
      if(cur.right !=null){
        queue.offer(cur.right);
      }
    }
    res.add(level);
  }
  return res;
}
///////////////////
public List<List<Integer>> levelOrder4(TreeNode root){
  if(root==null){
    return null;
  }
  Queue<TreeNode> queue = new LinkedList<>();
  List<List<Integer>> res = new ArrayList<>();
  queue.offer(root);
  while(!queue.isEmpty()){
    int size =  queue.size();
    List<Integer> level = new ArrayList<>();
    for(int i=0; i<size; i++){
      TreeNode curr = queue.poll();
      level.add(cur.val);
      if(curr.left!=null){
        queue.offer(curr.left);
      }
      if(curr.right!=null){
        queue.offer(curr.right);
      }
    }
    res.add(level);
  }
  return res;
}
/////////////////////////
public List<List<Integer>> levelOrder2(TreeNode root){
  if(root ==null){
    return null;
  }
  List<List<Integer>> res = new ArrayList<>();
  Queue<TreeNode> queue = LinkedList<>();
  queue.offer(root);
  while(!queue.isEmpty()){
    int size = queue.size;
    List<TreeNode> list = new ArrayList<>();

    for(int i=0; i<size; i++){
      TreeNode curr = queue.poll();
      list.add(curr.val);
      if(curr.left!=null){
        queue.offer(curr.left);
      }
      if(curr.right!=null){
        queue.offer(curr.right);
      }
    }
    res.add(list);
  }
  return res;
}
//
public List<List<Integer>> levelOrder3(TreeNode root){
  if(root == null){
    return null;
  }
  List<List<Integer>> res = new ArrayList<>();
  Queue<TreeNode> queue = new LinkedList<>();
  queue.offer(root);
  while(!queue.isEmpty()){
    int size = queue.size;
    List<TreeNode> list = new ArrayList<>();
   
    for(int i=0; i<size; i++){
       TreeNode cur = queue.poll();
       list.add(curr.val);
      if(curr.left!=null){
        queue.offer(curr.left);
      }
      if(curr.right !=null){
        queue.offer(curr.right);
      }
    }
  }
  return res;
}
////
public List<List<Integer>> levelOrder4(TreeNode root){
  if(root == null) return null;
  List<List<Integer>> res = new ArrayList<>();
  Queue<TreeNode> queue = new LinkedList<>();
  queue.offer(root);

  while(!queue.isEmpty()){

    int size = queue.size();
    for(int i=0; i<size; i++){
      List<Integer> level = new ArrayList<>();
      TreeNode cur = queue.poll();
      if(cur.left!=null){
        queue.offer(cur.left);
      }
      if(cur.right!=null){
        queue.offer(cur.right);
      }
      Level.add(curr);
    }
    res.add(level);
  }
  return res;
}

