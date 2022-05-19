import java.util.TreeSet;

/*abstract
Given an integer array nums and two integers k and t, return true if there are two distinct indices 
i and j in the array such that abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.

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

1 <= nums.length <= 2 * 104
-231 <= nums[i] <= 231 - 1
0 <= k <= 104
0 <= t <= 231 - 1
*/
class Solution {
  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
      TreeSet<Long> set = new TreeSet<>();
      for(int i=0; i<nums.length;i++){
        Long floor = set.floor((long)nums[i]);
        Long ceil = set.ceiling((long)nums[i]);

        if(floor !=null && (long)nums[i]-floor<=t) return true;
        if(ceil  !=null && ceil-(long)nums[i]<=t) return true;

        set.add((long)nums[i]);

        if(set.size()>k){
          set.remove((long)nums[i-k]);
        }
      }
      return false;
  }
}