class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int result =0;
    for(int item:nums){
      if(item == 0){
        count=0;
      }else{
        count++;
        if(count>result){
          result = count;
        }
      }
    }
    return result;
  }
}

class Solution {
  public int findNumbers(int[] nums) {
    int count =0;
    for(int item : nums){
      int digits = 0;
      for(int item; item>=1; item/10){
        digits++;
      }
      if(digits%2==0){
        count++;
      }
    }
    return count;
  }
}