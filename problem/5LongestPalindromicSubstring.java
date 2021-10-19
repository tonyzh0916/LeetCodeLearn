/*
Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
Example 3:

Input: s = "a"
Output: "a"
Example 4:

Input: s = "ac"
Output: "a"
 
Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
*/

class Solution {
  int maxLen =0;
  int left = 0;
  
  public String longestPalindrome(String s) {
      if(s==null || s.length()<=1) return s;
      
      for(int i=0; i<s.length(); i++){
          helper(s,i,i); //aba
          helper(s,i,i+1);//abba
      }
      
      return s.substring(left, left+maxLen);
  }
  
  private void helper(String s, int l, int r){
      while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
          if(r-l+1 > maxLen){
              left =l;
              maxLen = r-l+1;
          }
          l--;
          r++;
      }
  }
}