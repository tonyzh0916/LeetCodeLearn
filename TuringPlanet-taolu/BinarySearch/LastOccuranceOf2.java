class Solution{
  public  int binarySearch3(int[] arr,  int k){
    int l=0, r=arr.length-1;
    while(l<r){
      int mid = l+(r-l+1)/2;
      if(arr[mid]>k){
        r= mid-1;
      }else{
        l=mid;
      }
    }
    return l;
  }
}
