/*leetcode 373

You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.

Define a pair (u, v) which consists of one element from the first array and one element from the 
second array.

Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.

Example 1:

Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]]
Explanation: The first 3 pairs are returned from the sequence: 
[1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]

Example 2:

Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
Output: [[1,1],[1,1]]
Explanation: The first 2 pairs are returned from the sequence: 
[1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]

Example 3:

Input: nums1 = [1,2], nums2 = [3], k = 3
Output: [[1,3],[2,3]]
Explanation: All possible pairs are returned from the sequence: [1,3],[2,3]
 

Constraints:

1 <= nums1.length, nums2.length <= 105
-109 <= nums1[i], nums2[i] <= 109
nums1 and nums2 both are sorted in ascending order.
1 <= k <= 1000

*/

private static class SumPair implements Comparable<SumPair>{
  private int row;
  private int col;
  private long value;

  SumPair(int row, int col, int value){
    this.row = row;
    this.col = col;
    this.value= value;
  }

  public int compareTo(SumPair other){
    return Long.compare(this.value, other.value);
  }
}

public List<int[]> KSmallestPairs(int[] nums1, int[] nums2, int k){
  int[][] dirs ={{0,1},{1,0}};
  List<int[]> result = new ArrayList<>();
  if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0 || k==0){
    return result;
  }

  int m = nums1.length, n=nums2.length;
  boolean[][] visited = new boolean[m][n];
  Queue<SumPair> minHeap = new PriortyQueue<>();
  minHeap.off(new SumPair(0,0,nums1[0]+nums2[0]));
  visited[0][0] = true;
  while (k>0 && !minHeap.isEmpty()){
    SumPair min = minHeap.poll();
    result.add(new  int[]{nums1[min.row], nums2[min.col]});
    k--;
    for(int[] dir : dirs){
      int r = min.row+dir[0];
      int c=min.col+dir[1];
      if(r<0||r==m||c<0||c==n||visited[r][c]){
        continue;
      }
      visited[r][c] =true;
      minHeap.offer(new SumPair(r,c,nums1[r]+nums2[c]))
    }
  }
  return result;
}