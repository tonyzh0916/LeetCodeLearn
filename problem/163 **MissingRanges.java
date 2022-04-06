import java.util.ArrayList;
import java.util.List;

/*
Given a sorted integer array nums, where the range of elements are in the inclusive range 
[lower, upper], return its missiing ranges
*/

class Solution{
  public List<String> findMissingRanges(int[] nums, int lower, int upper){
    List<String> res = new ArrayList<>();
    long alower = (long)lower;
    long aupper = (long)upper;

    for(int num : nums){
      if(alower == num){
        alower++;
      }else if(alower <num){
        if(alower+1==num){
          res.add(String.valueOf(alower));
        }else{
          res.add(alower +"->"+(num-1));
        }
        alower = (long)num+1;
      }
    }
    if(alower == aupper){
      res.add(String.valueOf(alower));
    }else if(alower<aupper){
      res.add(alower+"->"+aupper);
    }
    return res;
  }
}
