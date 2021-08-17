/*
Given an integer array nums, return the maximum difference between two successive elements in its sorted form. 
If the array contains less than two elements, return 0.

You must write an algorithm that runs in linear time and uses linear extra space.

 

Example 1:

Input: nums = [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
Example 2:

Input: nums = [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.

*/

public int maximumGap(int[] num){
  if(num==null || num.length<2){
    return 0;
  }
  //get the max and min value of the array
  int min = num[0];
  int max = num[0];
  for(int val : num){
    min = Math.min(min, val);
    max = Math.max(max, val);
  }
  int n = num.length;

  for(int val : num){
    if(val == min || val==max){
      continue;
    }
    int idx =(val-min)/gap;
    mins[idx]=Math.min(val, mins[idx]);
    maxs[idx]=Math.max(val, maxs[idx]);
  }

  int maxGap = Integer.MIN_VALUE;
  int previous = min;
  for(int i=0; i<n-1;i++){
    if(min[i]==Integer.MAX_VALUE){
      continue;
    }
    maxGap = Math.max(maxGap, mins[i]-previous);
    previous = maxs[i];
  }
  maxGap = Math.max(maxGap, max-previous);
  return maxGap;
}