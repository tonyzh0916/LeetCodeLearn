/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing 
the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
 
Follow up: Can you come up with an algorithm that runs in O(m + n) time?]
*/
/*
混合插入有序数组，由于两个数组都是有序的，所有只要按顺序比较大小即可。题目中说了 nums1 数组有足够大的空间，说明不用 resize 数组，又给了m和n，
那就知道了混合之后的数组的大小，这样就从 nums1 和 nums2 数组的末尾开始一个一个比较，把较大的数，按顺序从后往前加入混合之后的数组末尾。
需要三个变量 i，j，k，分别指向 nums1，nums2，和混合数组的末尾。进行 while 循环，如果i和j都大于0，再看如果 nums1[i] > nums2[j]，
说明要先把 nums1[i] 加入混合数组的末尾，加入后k和i都要自减1；反之就把 nums2[j] 加入混合数组的末尾，加入后k和j都要自减1。循环结束后，
有可能i或者j还大于等于0，若j大于0，那么还需要继续循环，将 nums2 中的数字继续拷入 nums1。若是i大于等于0，那么就不用管，因为混合数组本身就放在 
nums1 中
*/
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i=m-1, j=n-1, k=m+n-1;
      while(i>=0 && j>=0 ){
          if(nums1[i]>=nums2[j]) {
              nums1[k--]=nums1[i--];
          }else{
              nums1[k--]=nums2[j--];
          }
      }
      while(j>=0){
          nums1[k--]=nums2[j--];
      }
  }
}