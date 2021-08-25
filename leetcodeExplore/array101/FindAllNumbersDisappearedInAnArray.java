/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in 
the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
*/

public static List<Integer> findDisappearedNumbers(int[] nums) {
  List<Integer> list = new  ArrayList<Integer>();
  for(int  i=0; i<nums.length;i++) {
    nums[Math.abs(nums[i])-1]= -Math.abs(nums[Math.abs(nums[i]-1)]);
  }
  for(int i=0; i<nums.length;i++) {
    if(nums[i]>0) {
      list.add(i+1);
    }
  }
  return list;
}




public List<Integer> findDisappearedNumbers2(int[] nums) {
  List<Integer> list = new ArrayList<Integer>();
  List<Integer> newList = new ArrayList<Integer>();
  for(int num : nums) {
    list.add(num);
  }
  for(int i=1; i<list.size()+1;i++) {
    if(!list.contains(i)) {
      newList.add(i);
    }
  }
  return newList;
}


