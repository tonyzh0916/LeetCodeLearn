class Solution {
  public int myAtoi(String str) {
    int i=0;

    while(i<str.length() && str.charAt(i)==' '){
      i++;
    }

    if(i==str.length()) return 0;

    int isNeg = 1;
    if(str.charAt(i)=="+"||str.charAt(i)=="-"){
      if(str.charAt(i)=='-'){
        isNeg =-1;
      }
      i++;
    }
    if(i == str.length()) return 0;

    int res =0;

    while(i<str.length()){
      char c = str.charAt(i);
      if(c<'0' || c>'9'){
        return res*isNeg;
      }

      int num = c-'0';
      int temp = res*10+num;
      if(temp/10 !=res){
        return isNeg==-1?Integer.MIN_VALUE : Integer.MAX_VALUE;
      }
      res =temp;
      i++;
    }
    return res *isNeg;
  }
}



//////////////////////////
class Solution {
  public int myAtoi2(String str) {
    if(str == null || str.length()== 0){
      return 0;
    }

    int index = 0;

    while(index<str.length() && str.charAt(index)==' '){
      index ++;
    }

    if(index == str.length()){
      return 0;
    }

    int sign =1;
    if(str.charAt(index)=='+' || str.charAt(index)=='-'){
      sign=str.charAt(index)=='+'?1:-1;
      index++;
    }

    int res =0;
    while(index<str.length()){
      int digit = str.charAt(index)-'0';
      if(digit <0 || digit >9)  break;

      int newRes = res*10+digit;
      if(Integer.MAX_VALUE/10<res || (Integer.MAX_VALUE/10 == res && Integer.MAX_VALUE%10<digit)){
        return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      res = newRes;
      index++;
    }
    return res*sign;
  }
}