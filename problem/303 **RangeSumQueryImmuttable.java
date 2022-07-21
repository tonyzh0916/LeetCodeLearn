import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 */
class NumArray {
  List<Integer> sum = new ArrayList<>();
  public NumArray(int[] nums) {
      sum.add(0);
      int acc = 0;
      for(int i=0; i<nums.length; i++){
        acc +=nums[i];
        sum.add(acc);
      }
  }
  
  public int sumRange(int left, int right) {
      return sum.get(j+1)-sum.get(i);
  }
}
