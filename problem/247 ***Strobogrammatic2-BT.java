import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Find all strobogrammatic numbers that are of length = n.

Example:

Input:  n = 2
Output: ["11","69","88","96"]
 */

class Solution {
  public List<String> findStrobogrammatic(int n) {
      HashMap<String, String> map = new HashMap<>();
      map.put("0", "0");
      map.put("1", "1");
      map.put("6", "9");
      map.put("8", "8");
      map.put("9", "6");

      List<String> res = new ArrayList<>();
      String curr = "";
      if(n % 2 == 1) {
          helper(res, "0", map, n - 1);
          helper(res, "8", map, n - 1);
          helper(res, "1", map, n - 1);
      } else {
          helper(res, "", map, n);
      }
      return res;
  }

  private void helper(
      List<String> res,
      String curr,
      HashMap<String, String> map,
      int remain) {

      if(remain == 0) {
          res.add(curr);
          return;
      }

      for(String key : map.keySet()) {
          if(remain == 2 && key == "0") continue;
          helper(res, key + curr + map.get(key), map, remain - 2);
      }
  }
}