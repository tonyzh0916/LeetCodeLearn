/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add 
up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 
Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/
//solution 1
class Solution {
  public int[] twoSum(int[] nums, int target) {
      int[] aaa = new int[2];
      
      for(int i=0; i<nums.length-1; i++){
          for(int j=i+1; j<nums.length;j++){
              if(nums[i]+nums[j]==target){
                  aaa[0]=i;
                  aaa[1]=j;
              }
          }
      }
      return aaa;
  }
}

//solution 2
class Solution {
  public int[] twoSum(int[] nums, int target) {
  int[] result = new int[2];
  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
  for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
          result[1] = i;
          result[0] = map.get(target - nums[i]);
          return result;
      }
      map.put(nums[i], i);
  }
  return result;
  }
}


//----------------------------- practice 11/29
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
  }
}
//----------------------------- practice 11/20
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
}
}

//---------practive 1/5/2022
class Solution{
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
