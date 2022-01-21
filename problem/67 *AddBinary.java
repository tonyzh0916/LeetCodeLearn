/*
Given two binary strings a and b, return their sum as a binary string.
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 
Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.

4443:499
*/

class Solution {
  public String addBinary(String a, String b) {
      StringBuilder sb = new StringBuilder();
      int p1= a.length()-1;
      int p2=b.length()-1;

      int carry =0;
      while(p1>=0||p2>=0){
        int num1 = p1>=0?(a.charAt(p1)-'0'):0;
        int num2 = p2>=0?(b.charAt(p2)-'0'):0;

        int sum = num1+num2+carry;
        sb.insert(0, sum%2);
        carry = sum/2;
        p1--;
        p2--;
      }

      if(carry!=0){
        sb.insert(0, carry);
      }
      return sb.toString();
  }
}