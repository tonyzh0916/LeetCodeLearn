package TuringPlanet-taolu.BinarySearch;

class Solution{
  public int binarySearch(int[]  arr, int k){
    int l=0, r=arr.length-1;
    while(l<r){
      int mid = l+(r-l)/2;
      if(arr[mid]>k){
        r=mid;
      }else{
        l=mid+1;
      }
    }
    return l; 
  }
}
