package BinarySearch2;

class  Solution{
  public  int binarySearch(int[] arr , int k){
  int l=1, r=arr.length-1;
  while(l<=r){
    int mid = l  + (r-l)/2;

    if(arr[mid]==k){
      return mid;
    }
   else if(arr[mid]>k){
      r = mid-1;
    }else{
      l = mid+1;
    }
  }
  return -1;
}

///////////////////////////找一个模糊值  比如最接近4的数
public static int binarySearch2(int[] arr, int k) {
  int l=0, r=arr.length-1;
  while(l<r) {
    int mid = l+(r-l)/2;
    if(arr[mid]<k) {
      l = mid+1;
    }else {
      r=mid;
    }
  }
  return l;
}
}


