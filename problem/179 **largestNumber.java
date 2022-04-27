import java.util.Arrays;
import java.util.Comparator;

/*abstract
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
 
Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 109
*/
class Solution {
  public String largestNumber(int[] num) {
    if(num == null || num.length==0){
      return "";
    }  

    String[] s_num =new String[num.length];
    for(int i=0; i<num.length ; i++){
      s_num[i] = String.valueOf(num[i]);
    }

    Comparator<String> comp = new Comparator<String>() {
      @Override
      public int compare(String str1, String str2){
        String s1 = str1 + str2;
        String s2 = str2 + str1;
        return s2.compareTo(s1);
      }
    };

    Arrays.sort(s_num, comp);

    if(s_num[0].equals("0")) return "0";

    StringBuilder sb = new StringBuilder();
    for(String s: s_num){
      sb.append(s);
    }
    return sb.toString();
  }
}