/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/
class Solution {
  public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      
      for(char c : s.toCharArray()){
          //反着放入符号
          if(c=='('){
              stack.push(')');
          }else if(c=='['){
              stack.push(']');
          }else if(c=='{') {
              stack.push('}');
          }else{
              //1, 错误情况： 要判断是不是空， 处理情况[()]}
              //stack.isEmpty()也是正确的
              if(stack.empty()) return false;
              //2 错误情况 [{]}
              char temp = stack.pop();
              if(c!=temp) return false;
          }
      }
      //3 错误情况 处理情况[()]{
      if(!stack.empty()){
          return false;
      }else{
          return true;
      }
  }
}