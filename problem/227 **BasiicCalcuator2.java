import java.util.Stack;

/*
 * Given a string s which represents an expression, evaluate this expression and return its value. 

The integer division should truncate toward zero.

You may assume that the given expression is always valid. All intermediate results will be in the range of 
[-231, 231 - 1].

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, 
such as eval().

Example 1:

Input: s = "3+2*2"
Output: 7
Example 2:

Input: s = " 3/2 "
Output: 1
Example 3:

Input: s = " 3+5 / 2 "
Output: 5
 

Constraints:

1 <= s.length <= 3 * 105
s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
s represents a valid expression.
All the integers in the expression are non-negative integers in the range [0, 231 - 1].
The answer is guaranteed to fit in a 32-bit integer.
 */
class Solution {
  public int calculate(String s) {
      int len = s.length();
      if(s==null || len ==0) return 0;

      Stack<Integer> stack = new Stack<Integer>();
      int res = 0;
      int num =0;
      char sign ='+';

      for(int i=0; i<len;i++){
        if(Character.isDigit(s.charAt(i))){
          num = s.charAt(i)-'0';
          //如果当前数字后边也是数字 那就要*10来的到这整个的数字
          while(i+1<len && Character.isDigit(s.charAt(i+1))){
            num = num *10 + s.charAt(i+1)-'0';
            i++;
          }
        }
        //得到一个运算符
        //不是数字也不是空格
        //注意最后一个数字 由于符号总是在数字之前
        //因此最后一个数字无法计算 这时需要使用 i==len-1 进行最后一次运算
        if(!Character.isDigit(s.charAt(i))&& s.charAt(i)!=' '|| i==len-1){
          //如果是+-就放进去
          if(sign=='+')  stack.push(num);
          if(sign =='-') stack.push(-num);
          //如果是*/就先计算再放进去
          if(sign=='*') stack.push(stack.pop()*num);
          if(sign=='/') stack.push(stack.pop()/num);
          sign = s.charAt(i);
          num=0;
        }
      }
      for(int i : stack){
        res +=i;
      }
      return res;
  }
}