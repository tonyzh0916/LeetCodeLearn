class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
      return bts(nums, 0, nums.length-1);
  }
  
  private TreeNode bts(int[] nums, int start, int end){
      if(start > end){
          return null;
      }
      int mid = (start+end)/2;
      TreeNode root = new TreeNode(nums[mid]);
      root.left = bts(nums, start, mid-1);
      root.right = bts(nums, mid+1, end);
      return root;
  } 
}


class Solution {
  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
      TreeSet<Long> set = new TreeSet<>();
      for(int i=0; i<nums.length;i++){
          Long floor = set.floor((long)nums[i]);
          Long ceil = set.ceiling((long)nums[i]);
          
          if(floor!=null && (long)nums[i]-floor<=t) return true;
          if(ceil !=null && ceil-(long)nums[i]<=t) return true;
          
          set.add((long)nums[i]);
          if(set.size()>k){
              set.remove((long)nums[i-k]);
          }
      }
      return false;
  }
}

class Solution{
    public List<Integer> closestKValues(TreeNode root, double target, int k){
        LinkedList<Integer> res = new LinkedList<>();
        collect(root, target, k,res);
        return res;
    }

    private void collect(TreeNode root, double target, int k, LinkedList<Integer> res){
        if(root==null){
            return;
        }
        collect(root.left, target, k, res);

        if(res.size()==k){
            //if size k, add curent and remove head of it's optimal, otherwise return
            if(Math.abs(target-root.val)>=Math.abs(target-res.peekFirst())){
                return;
            }
            res.removeFirst();
        }
        res.add(root.val);
        collect(root.right, target,k,res);
    }
}