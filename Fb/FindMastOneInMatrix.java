/*
A matrix has 0s and 1s only. All the 1s in  every row are to the right of 0s.
Find out  the left most 1 in the entire matrix. Return its column index. if ther is no 1s, return -1

0 0 0 0 0 1 1
0 0 0 1 1 1 1
0 1 1 1 1 1 1
0 0 0 0 0 0 1
0 0 0 0 0 1 1
0 0 0 0 0 0 0
0 0 0 1 1 1 1
*/

//each ro do binary search, time mlog(n)
public static class Solution1 extends Test{
  public int find(int[][] nums){
    if(nums==null || nums.length ==0){
      throw new IllegalArgumentException();
    }
    int res = -1;
    for(int[] row : nums){
      int index = findFirstOne(row, 0, row.length-1);
      if(res==-1){
        res= index;
      }else if(index!=-1){
        res = Math.min(res, index);
      }
    }
    return res;
  }

  private static int findFirstOne(int[] nums, int left, int right){
    int result = -1;
    while(left<=right){
      int mid = left +(right-left)/2;
      if(nums[mid]==1){
        result =mid;
        right = mid-1;
      }else{
        left = mid+1;
      }
    }
    return result;
  }
}


/*        ->
0 0 0 0 0 0 0 1
              0  |
              0 \|/
        <-1 1 1
*/

//time: m+n
public static class Solution2 extends Test{
  public int find(int[][] nums){
    if(nums == null || nums.length==0){
      throw new IllegalArgumentException();
    }
    int j = nums[0].length-1;
    int res = -1;
    for(int[] row : nums){
      while(j>=0 && row[j]==1){
        res = j;
        j--;
      }
    }
    return res;
  }
}

//using binary search to find  
public static class Solution3 extends Test{
  public int find(int[][] nums){
    if(nums == null || nums.length ==0){
      throw new IllegalArgumentException();
    }
    int j = nums[0].length-1;
    int res = -1;
    for(int[] row : nums){
      int index = findFirstOne(row, 0, j);
      if(index  !=-1){
        j=index;
        res=index;
      }
    }
    return res;
  }
}