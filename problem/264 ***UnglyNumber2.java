class Solution {
  public int nthUglyNumber(int n) {
      int[] res = new int[n];
      res[0] = 1;
      int i2=0;
      int i3=0;
      int i5=0;

      for(int i=1; i<n; i++){
        res[i]=Math.min(res[i2]*2, Math.min(res[i3]*3, res[i5]*5));
        if(res[i]==res[i2]*2) i2+=1;
        if(res[i]==res[i3]*3) i3+=1;
        if(res[i]==res[i5]*5) i5+=1;
      }
      return res[n-1];
  }
}