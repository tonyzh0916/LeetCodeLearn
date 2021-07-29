// leetcode 367 Valid Perfect Square
/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.
Follow up: Do not use any built-in library function such as sqrt.

Example 1:
Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
 

Constraints:

1 <= num <= 2^31 - 1
*/
public boolean isPerfectSquare(int num){
  long l=0;
  long r=num;
  while(l<=r){
    long mid  = l+(num-l)/2;
    long sqmid = mid*mid;
    if(sqmid==num){
      return true;
    }
    if (sqmid>num){
      r=mid-1;
    }else{
      l=mid+1;
    }
  }
  return false;
}