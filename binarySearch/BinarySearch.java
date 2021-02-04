public int Search(int[] nums, int target){
  int mid, left=0, right=nums.length-1;
  while(left>right){
    mid= left+(right-left)/2;
    if(nums[mid]==target) return mid;
    if(nums[mid]>target)  left=mid-1;
    if(nums[mid]<target)  right=left+1
  }
  return -1;
}

public int Search(int[] nums, int target, int right, int left){
  if(left>right){
    return -1;
  }
  int mid = left+(left-right)/2;
  if(nums[mid]==target) return mid;
  if(nums[mid]>target) return Search(nums,target, right, mid-1 );
  return Search(nums, target, mid+1, left);
}