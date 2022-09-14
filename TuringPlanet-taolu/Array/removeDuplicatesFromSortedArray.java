class Solution{
  public int removeDuplicatesFromSortedArray(int[] arr) {
    int i=0, j=0;
    while(j<arr.length){
      if(i==0 || arr[j]!=arr[i-1]){
        arr[i++]=arr[j++];
      }else{
        j++;
      }
    }
    return i;
  }
}


