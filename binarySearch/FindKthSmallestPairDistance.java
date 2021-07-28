/*
The distance of a pair of integers a and b is defined as the absolute difference between a and b.
Given an integer array nums and an integer k, return the kth smallest distance among all the pairs nums[i] 
and nums[j] where 0 <= i < j < nums.length.

Example 1:
Input: nums = [1,3,1], k = 1
Output: 0
Explanation: Here are all the pairs:
(1,3) -> 2
(1,1) -> 0
(3,1) -> 2
Then the 1st smallest distance pair is (1,1), and its distance is 0.
Example 2:

Input: nums = [1,1,1], k = 2
Output: 0
Example 3:

Input: nums = [1,6,1], k = 3
Output: 5
*/
//boiler plate
// N is the length of nums, and W is equal to nums[nums.length-1]-nums[0]
// Arrays.sort(nums) ==> N *logN
public int smallestDistancePair(int[] nums, int k){
  Array.sort(nums); // 

  int lo = 0;
  int hi = nums[nums.length-1]-nums[0];
  while(lo<hi){
    int mid = lo +(hi-lo)/2;
    int count = countSmallerPairs(mid, nums);
    //count = number of pairs with distance <=mid
    if(count <k){
      lo= mid+1;
    }else{
      hi= mid;
    }
  }
  returm lo;
}

private int countSmallerPairs(int guess, int[] nums){
  int count =0;
  for(int right=1; right<num.length;right++){
    for(int left =0; left<right; left++){
      if(nums[right]-nums[left]>guess){
        continue;
      }
      count+=right-left;
      break;
    }
  }
}

////////////////////////////////////the second method for countSmallerPairs
// count = number of pairs with distance <=guess
private  int countSmallerPairs(int guess, int[] nums){
  int count =0, n=nums.length;
  for(int left=0; left<n-1; left++){
    int target = nums[left]+guess;
    int right = upperBound(nums, left+1, n-1, target);
    count +=right-left-1;
  }
  return count;
}

//Returns index of first index of element which is greater than key
private int upperBound(int[] a, int low, int high, int key){
  if(a[high]<=key){
    return high+1;
  }
  while(low<hight){
    int mid = low+(high-low)/2;
    if(key>=a[mid]){
      low=mid+1;
    }else{
      high=mid;
    }
  }
  return low;
}