import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>();
       
       while(n!=1){
           int temp=0;
           while(n!=0){
               int digit = n%10;
               temp+= digit*digit;
               n/=10;
           }
           if(!set.add(temp)){
               return false;
           }
           n=temp;
       }
       return true;
    }
}