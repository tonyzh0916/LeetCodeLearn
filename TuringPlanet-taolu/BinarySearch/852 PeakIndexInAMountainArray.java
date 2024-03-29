class Solution {
  public int peakIndexInMountainArray(int[] arr) {
          int l=0, r=arr.length-1;
  while(l+1<r) {
    int mid = l + (r-l)/2;
     if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
      l=mid;
    }else {
      r=mid;
    }
  }
  return arr[l]>arr[r]?l:r;
  }
}