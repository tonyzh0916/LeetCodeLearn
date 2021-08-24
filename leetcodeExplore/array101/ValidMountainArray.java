/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 104
*/

class Solution {
  public static boolean validMountainArray(int[] arr) {
      int n = arr.length, i=0, j=n-1;
          while(i<n-1 && arr[i]<arr[i+1]) ++i;
          while(j>0 && arr[j-1]>arr[j]) --j;
          return i>0 && j<n-1 && i==j;
  
  }
}



class Solution {
  public static boolean validMountainArray(int[] arr) {
    int peak = Integer.MIN_VALUE, peakIndex=-1;
    boolean left=true,  right=true;
    if(arr.length<3) return false;
    for(int i=0 ; i<arr.length;i++) {
      if(arr[i]>peak) {
        peak=arr[i];
        peakIndex=i;
      }		
    }
    if(peakIndex==0 || peakIndex==arr.length-1) {
      return false;
    }else {
      for(int m=0; m<peakIndex;m++) {
        if(arr[m]>=arr[m+1]) {
          left=false;
        }
      }
      for(int n=arr.length-1; n>peakIndex;n--) {
        if(arr[n]>=arr[n-1]) {
          right=false;
        }
      }
    }
    if(left && right) {
      return true;
    }
    
      return false;
  }
}