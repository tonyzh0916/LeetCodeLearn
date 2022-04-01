/*
The API: int read4 reads 4 characters at a time from a file.

The return value is the actual number oof characters read. For example, it returns 3 if there is only 3 characters
left in the file

By using the read4 API, implement the function int read that reads n charaacters from the file.
*/
class Solution{

public int read (char[] buf, int n){
  char[] temp = new char[4];
  int index = 0;

  while(true){
    int count = read4(temp);
    count = Math.min(count, n-index);
    for(int i=0; i<count; i++){
      buf[index++] = temp[i];
    }
    if(index ==n || count<4) return index;
  }
}
}
