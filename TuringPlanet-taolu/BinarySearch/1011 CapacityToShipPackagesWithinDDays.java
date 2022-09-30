class Solution {
  public int shipWithinDays(int[] weights, int days) {
      int left =0;
      int right = 0;
      for(int n : weights){
          left = Math.max(left, n);
          right +=n;
      }
      
      while(left<right){
          int mid = left +(right -  left)/2;
          if(canShip(weights, mid)>days){
              left = mid+1;
          }else{
              right = mid;
          }
      }
      return left;
  }
  
  private int canShip(int[] weights,  int largestSum ){
      int days_need=1;
      int curWeight =0;
      for(int n : weights){
          if(curWeight + n >largestSum){
              curWeight= n;
              days_need++;
          }else{
              curWeight+=n;
          }
      }
      return days_need;
  }
}
