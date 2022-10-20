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

  public int[] dailyTemperatures2(int[] T){
    Deque <Integer> stack = new ArrayDeque<>();
    int[] res = new int[T.length];
    for(int i=0; i<T.length; i++){
      while(!stack.isEmpty() && T[stack.peek()]<T[i]){
        int index = stack.pop();
        res[index]=i-index;
      }
      stack.push(i);
    }
    return res;
  }
}


