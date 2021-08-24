/*
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

0 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
*/

class Solution {
  public  int removeDuplicates(int[] nums) {
    if(nums.length==0) return 0;
      int numsLength= nums.length, index=0, key=-101, newIndex=0;
      while(index<numsLength) {
        if(nums[index]!=key) {
          key=nums[index];
          nums[newIndex++]=nums[index];
        }else {
          index++;
        }
      }
      return newIndex;
  }
}
