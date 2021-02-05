class Solution {
  public int findNumbers(int[] nums) {
    int count =0;
    for(int item : nums){
      if(String.valueOf(item).length()%2==0){
        count++;
      }
    }
    return count;
  }
}