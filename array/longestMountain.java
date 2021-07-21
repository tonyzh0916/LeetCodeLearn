public int longestMountain(int[] A){
  int n= A.length, res =0;
  int[] left = new int[n], right= new int[n];
  for(int i=n-2; i>=0;--i){
    if(A[i]>A[i+1]){
      right[i]=right[i+1]+1;
    }
  }

  for(int i=0; i<n; ++i){
    if(i>0 && A[i]>A[i-1]){
      left[i] = left[i-1]+1;
    }
    if(left[i]>0 && right[i]>0){
      res = Math.max(res, left[i]+right[i]+1);
    }
  }
  return res;
}