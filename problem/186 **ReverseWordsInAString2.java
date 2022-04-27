class Solution{
  public void reverseWords(char[] str){
    if(str == null || str.length <=1) return;
    reverse(str, 0, str.length-1);

    int index = 0;
    int start =0;

    while(index<=str.length){
      if(index == str.length || str[index]==' '){
        reverse(str, start, index-1);
        start=index+1;
      }
      index++;
    }
  }

  private void reverse(char[] str, int start, int end){
    while(start<end){
      char temp = str[start];
      str[start] = str[end];
      str[end] = temp;
      start++;
      end--;
    }
  }
}
