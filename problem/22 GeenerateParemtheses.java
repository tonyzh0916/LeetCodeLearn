/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 
Constraints:

1 <= n <= 8
*/

class Solution {
  List<String> res;
  public List<String> generateParenthesis(int n) {
      res =new ArrayList<>();
      helper("", n, n);
      return res;
  }
  
  private void helper(String curr, int left, int right){
      if(left == 0 && right ==0){
          res.add(curr);
          return;
      }
      
      if(left>0){
          helper(curr+"(", left-1, right);
      }
      
      if(right>left){
          helper(curr+")", left, right-1);
      }
  }
}