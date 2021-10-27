/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, 
which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four 
is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it 
making four. The same principle applies to the number nine, which is written as IX. There are six instances 
where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

 

Example 1:

Input: num = 3
Output: "III"
Example 2:

Input: num = 4
Output: "IV"
Example 3:

Input: num = 9
Output: "IX"
Example 4:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 5:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= num <= 3999
*/

class Solution {
  public String intToRoman(int num) {
      // 注意每个字符串数组的空位
      String M[] = {"", "M", "MM", "MMM"};
      // 空，1000，2000，3000
      String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      // 空，100，200，300，400，500，600，700，800，900
      String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      // 空，10，20，30，40，50，60，70，80，90
      String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      // 空，1，2，3，4，5，6，7，8，9
      return M[num / 1000] + C[(num / 100) % 10] + X[(num / 10) % 10] + I[num % 10];
      // M[千位] + c[百位] + x[十位] + i[个位]
  }
}