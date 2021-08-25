/*
Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, 
return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation: The third maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/
public class Solution{
  public int thirdMax(int[] nums){
    //temp[0] <temp[1]<temp[2];
    long temp[] = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
    int i=0;
    int n=nums.length;

    for(int num : nums){
      if(num<temp[1] && num>temp[0]){
        temp[0]=num;
      }else if(num<temp[2] && num>temp[1]){
        temp[0]=temp[1];
        temp[1]=num;
      }else if(num>temp[2]){
        temp[0]=temp[1];
        temp[1]=temp[2];
        temp[2]=num;
      }
    }
    if(temp[0]==Long.MIN_VALUE){
      return (int)temp[2];
    }
    return (int)temp[0];
  }
}