import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else{
                if(stack.isEmpty()) return false;
                char temp = stack.pop();
                if(c!=temp) return false;
            }
        }
        if(stack.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
