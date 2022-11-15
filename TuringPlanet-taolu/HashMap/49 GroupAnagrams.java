import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for(String s : strs){
      String sorted = helper(s);
      if(!map.containsKey(sorted)){
        map.put(sorted, new ArrayList<>());
      }
      map.get(sorted).add(s);
    }
      List<List<String>>  res = new ArrayList<>();
      for(List<String> temp: map.values()){
        res.add(temp);
      }
      return res;
  }

  private String helper(String s){
    char[] c = s.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }
}
