import java.util.ArrayDeque;
import java.util.Deque;

class Solution{
  public int[] dailyTemperatures(int[] T){
    int n = T.length;
    int[] res = new int[n];
    Deque<Integer> stack = new ArrayDeque<>();
    for(int i=n-1; i>=0; i++){
      while(!stack.isEmpty() && T[i]>=T[stack.peek()]){
        stack.pop();
      }
      if(stack.isEmpty()){
        res[i]=0;
      }else{
        res[i] = stack.peek()-i;
      }
      stack.push(i);
    }
    return res;
  }
}
