/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical 
lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together 
with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of 
water (blue section) the container can contain is 49.
*/
class Solution {
  public int maxArea(int[] height) {
      int left =0;
      int right = height.length-1;
      int max =0;
      
      while(left < right ){
          int currMin = Math.min(height[left], height[right]);
          max = Math.max(max, currMin*(right-left));
          if(height[left]>height[right]){
              right--;
          }else{
              left++;
          }
      }
      return max;
  }
}