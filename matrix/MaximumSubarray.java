/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and 
return its sum.
A subarray is a contiguous part of an array.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 
Constraints:
1 <= nums.length <= 3 * 104
-105 <= nums[i] <= 105

DP 核心思想
1， Deduction formula
f(k)=Maximun sum of subarray ending at index k.
f(k)=max(f(k-1)+A[k], A[k])
We could deduce the final answer as f(n-1)
2, Initialization
f(0)=A[0]
3, Spave Imporovement(Bonus)
Since we only need to  access its previous element at each step, two variables are sufficient
Notic the difference between  the two: maxEndingHere and maxSoFar
maxEndingHere is the maximum sum of  subarray that must end at index k
maxSoFar is the global maximum subarray sum
*/