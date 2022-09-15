package TuringPlanet-taolu.Array;

class Solution{
  public void moveZeroes(int[] nums){
    int count =0;
    for(int i=0; i<nums.length; i++){
      if(nums[i]!=0){
        nums[count++]=nums[i];
      }
    }
    while(count<nums.length){
      nums[count++]=0;
    }
  }


  public  void moveZeroes2(int[] nums) {
    int i=0, j=0;
while(j<nums.length){
    if(nums[j]==0){
        j++;
    }else{
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        i++;
        j++;
    }
}
}
}
