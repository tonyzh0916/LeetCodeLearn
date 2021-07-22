/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
The replacement must be in place and use only constant extra memory.

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:
Input: nums = [1,1,5]
Output: [1,5,1]
Example 4:
Input: nums = [1]
Output: [1]

*/


public void nextPermutation(int[] nums){
  int n = nums.length;
  if(n<2){
    return
  }
  int index = n-1;
  while(index>0){
    if(nums[index-1]<nums[index]){
      break;
    }
    index--;
  }

  if(index==0){
    reverse(nums,0,n-1);
    return;
  }

  int val = nums[index-1];
  int  j  = n-1;
  while(j>=index){
    if(nums[j]>val){
      break;
    }
    j--;
  }
  swap(nums,j,index-1);
  reverse(nums, index, n-1);
}

private void swap(int[] a, int i, int j){
  int tmp = a[i];
  a[i] = a[j];
  a[j] = tmp;
}

private void reverse(int[] nums, int i, int j){
  while(i<j){
    int tmp = nums[i];
    nums[i++]=nums[j];
    nums[j--]=tmp;
  }
}