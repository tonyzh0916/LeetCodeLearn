

class Tree{
    public void dfsPre(TreeNode node){
    if(node == null){
      return ;
    }
    System.out.println(node.val);
    dfsPre(node.left);
    dfsPre(node.right);
  }

  public void dfsIn(TreeNode node){
    if(node ==null){
      return;
    }

    dfsIn(node.left);
    System.out.println(node.val);
    dfsIn(node.right);
  }

  public void dfsPo(TreeNode node){
    if(node == null){
      return 
    }
    dfsPo(node.left);
    dfsPo(node.right);
    System.out.println(node.val);
  }
}

