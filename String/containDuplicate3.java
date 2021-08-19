/*
Given an integer array nums and two integers k and t, return true if there are two distinct indices i and j 
in the array such that abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3, t = 0
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1, t = 2
Output: true

Example 3:
Input: nums = [1,5,9,1,5,9], k = 2, t = 3
Output: false
 
Constraints:

0 <= nums.length <= 2 * 104
-231 <= nums[i] <= 231 - 1
0 <= k <= 104
0 <= t <= 231 - 1
*/
public booleam containsNearbyAlmostDuplicate(int[] nums, int k, int t){
  if(k<1 || t<0){
    return false ;
  }
  // use k-size slide window
  Map<Long, Long> map = new HashMap<>();
  //key is bucket, vlaue is the actual remapped number 
  for(int i=0; i<nums.length; i++){
    long remappedNum = (long) nums[i]-Integer.MIN_VALUE;
    long bucket = remappedNum / ((long)t+1);
    if(map.size()>=k){
      long lostBucket = ((long) nums[i-k]-Integer.MIN_VALUE)/((long)t+1);
      map.remove(lastBucket);
    }
    map.put(bucket, remappedNum);
  }
}