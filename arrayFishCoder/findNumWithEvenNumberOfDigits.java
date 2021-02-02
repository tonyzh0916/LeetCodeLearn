class Solution {
  public int findNumbers(int[] nums) {
    int count =0;
    for(int item : nums){
      if(String.valueO f(item).length()%2==0){
        count++;
      }
    }
    return count;
  }
}