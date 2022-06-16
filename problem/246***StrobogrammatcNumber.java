import java.util.HashMap;
import java.util.Map;

/*
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Write a function to determine if a number is strobogrammatic. The number is represented as a string.

Example 1:

Input: num = "69"
Output: true
Example 2:

Input: num = "88"
Output: true
Example 3:

Input: num = "962"
Output: false
Example 4:

Input: num = "1"
Output: true
 */
class Solution{
  public boolean sStrobogrammatic(String num){
    Map<Character, Character> map = new HashMap<>();
    map.put('6', '9');
    map.put('9', '6');
    map.put('0', '0');
    map.put('8', '8');
    map.put('1', '1');
    int left = 0;
    int right=num.length()-1;

    while(left<=right){
      if(!map.containsKey(num.charAt(left))){
        return false;
      }

      if(map.get(num.charAt(left))!=num.charAt(right)){
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}