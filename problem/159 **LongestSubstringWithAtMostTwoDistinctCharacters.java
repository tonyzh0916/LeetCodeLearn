import java.util.HashMap;

/*
Given a string s, find the length of the longest substring that contains at most 2 distinct characters
 
*/
class Solution{
  public int lengthOfLongestSubstringTwoDistinct(String s){
    if(s==null || s.length()==0) return 0;

    HashMap<Character,Integer> map = new HashMap<>();
    
    int start = 0;
    int index =0;
    int res = 0;

    while(index <s.length()){
      map.put(s.charAt(index), index);
      index++;

      if(map.size()>2){
        int leftMost = s.length();
        for(int num: map.values()){
          leftMost = Math.min(leftMost, num);
        }
        map.remove(s.charAt(leftMost));
        start = leftMost+1;
      }
      res=Math.max(res,index-start);
    }
    return res;
  }
}