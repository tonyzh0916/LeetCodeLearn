class Solution{
  public char[] reverseString(char[] str){
    int i=0, j=str.length-1;
    while(i<j){
      char tmp = str[i];
      str[i] = str[j];
      str[j] = tmp;
      i++;
      j--;
    }
    return str;
  }
}
